# Write your MySQL query statement belowSELECT
SELECT DISTINCT author_id AS id
FROM views
WHERE author_id=viewer_id
ORDER BY author_id;