/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import stockapi.Stock_API.Entity.Roles;

/**
 *
 * @author faruq
 */
public interface RoleRepository  extends  JpaRepository<Roles, UUID> {
    
    Roles findByRoleId(UUID roleId);
}
