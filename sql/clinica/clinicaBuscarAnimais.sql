select a.ID,a.NOME,a.NASCIMENTO,e.id,e.NOME from animal a, especie e
where a.especie_id = e.id
;