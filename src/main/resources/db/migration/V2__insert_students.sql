DO $$
BEGIN
    -- Generate 50 random students
FOR i IN 1..50 LOOP
        INSERT INTO students (firstname, lastname, age)
        VALUES (
            -- Generate a random first name
            (ARRAY['John', 'Jane', 'Mike', 'Emma', 'Chris', 'Sophia', 'Ryan', 'Olivia', 'Alex', 'Mia'])[ceil(random() * 10)],
            -- Generate a random last name
            (ARRAY['Smith', 'Johnson', 'Brown', 'Taylor', 'Anderson', 'Thomas', 'Jackson', 'White', 'Harris', 'Martin'])[ceil(random() * 10)],
            -- Generate a random age between 18 and 30
            floor(random() * 13 + 18)::int
        );
END LOOP;
END $$;
