SELECT actor_id, director_id FROM ActorDirector
GROUP BY actor_ID, director_id
HAVING COUNT(*) >= 3
