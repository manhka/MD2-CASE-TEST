package service.Role;

import config.ConfigReadAndWrite;
import model.Role;
import model.RoleName;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RoleServiceIMLP implements IRoleService{
    public static String PATH_ROLE = "D:\\MODUL 2\\caseStudy_MD2\\src\\data\\Role";
    public static List<Role> roleList = new ConfigReadAndWrite<Role>().readFromFile(PATH_ROLE);

    @Override
    public List<Role> findAll() {
        if(roleList.size()>=2){
            return roleList;
        } else {
            roleList.add(new Role(1,RoleName.USER));
            roleList.add(new Role(2,RoleName.MANAGER));

        }
        new ConfigReadAndWrite<Role>().writeIntoFile(PATH_ROLE,roleList);
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleList.add(role);
    }

    @Override
    public Role findByName(RoleName name) {
        for (int i = 0; i < roleList.size(); i++) {
            if(name==roleList.get(i).getName()){
                return roleList.get(i);
            }
        }
        return null;
    }
}
