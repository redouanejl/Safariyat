package ma.cigma.Safariyat.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.Safariyat.exceptions.ConditionException;
import ma.cigma.Safariyat.models.Condition;
import ma.cigma.Safariyat.repositories.ConditionRepository;

@Service
@Transactional
public class ConditionServiceImpl implements ConditionService {

	@Autowired
	private ConditionRepository conditionRepository;

	@Override
	public Condition save(Condition c) {
		try {
			return conditionRepository.save(c);
		} catch (Exception e) {
			throw new ConditionException("Erreur de faire l'operation! la Condition n'a pas enregistrer");
		}
	}

	@Override
	public Condition findCondition(Long id) {
		Condition condition = conditionRepository.findById(id).get();

		if (condition == null)
			throw new ConditionException("La Condition avec id '"+id+"' n'existe pas!");

		return condition;
	}

	@Override
	public Iterable<Condition> findAll() {
		
		return conditionRepository.findAll();
	}

	@Override
	public void deleteCondition(Long id) {
		Condition condition = conditionRepository.findById(id).get();

		if (condition == null)
			throw new ConditionException("Erreur de faire l'operation car la Condition avec id '"+id+"' n'existe pas!");

		conditionRepository.delete(condition);

	}

}
