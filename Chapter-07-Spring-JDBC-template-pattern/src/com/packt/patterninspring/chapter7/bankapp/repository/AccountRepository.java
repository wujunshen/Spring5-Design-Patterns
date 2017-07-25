package com.packt.patterninspring.chapter7.bankapp.repository;

import com.packt.patterninspring.chapter7.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository {
	Account findAccountById(Long id);
}