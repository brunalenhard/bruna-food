package br.com.brunafood.brunafood.service;

import br.com.brunafood.brunafood.domain.User;
import br.com.brunafood.brunafood.exception.EntityNotFoundException;
import br.com.brunafood.brunafood.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findyById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
    }

    public User update(User user) {
        if (!userRepository.existsById(user.getId()))
            throw new EntityNotFoundException("Usuário nao encontrado");
        return userRepository.save(user);
    }
}
