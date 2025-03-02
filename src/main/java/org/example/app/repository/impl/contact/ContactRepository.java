package org.example.app.repository.impl.contact;

import org.example.app.entity.Contact;
import org.example.app.repository.BaseRepository;
import org.example.app.dto.contact.ContactDtoRequest;
import java.util.List;
import java.util.Optional;

public interface ContactRepository extends BaseRepository<Contact, ContactDtoRequest> {
    boolean create(ContactDtoRequest request);
    Optional<List<Contact>> fetchAll();
    Optional<Contact> fetchById(Long id);
    boolean update(Long id, ContactDtoRequest request);
    boolean delete(Long id);
}
