SELECT
    animal_type
    , coalesce(name, "No name")
    , sex_upon_intake
FROM
    animal_ins