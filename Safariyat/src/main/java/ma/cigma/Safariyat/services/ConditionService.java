package ma.cigma.Safariyat.services;

import ma.cigma.Safariyat.models.Condition;

public interface ConditionService {

	Condition save(Condition c);
	
	Condition findCondition(Long id);
	
	Iterable<Condition> findAll();
	
	void deleteCondition(Long id);
}
