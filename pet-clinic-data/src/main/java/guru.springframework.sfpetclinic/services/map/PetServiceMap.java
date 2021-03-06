package guru.springframework.sfpetclinic.services.map;

import guru.springframework.sfpetclinic.model.Pet;
import guru.springframework.sfpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
