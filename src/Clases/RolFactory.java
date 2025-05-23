

package Clases;

import java.util.HashMap;
import java.util.Map;

public class RolFactory {
    private static final Map<String, Rol> roles = new HashMap<>();

    public static Rol getRol(String nombre) {
        Rol rol = roles.get(nombre.toLowerCase());

        if (rol == null) {
            rol = new Rol(nombre);
            roles.put(nombre.toLowerCase(), rol);
        }

        return rol;
    }

    public static int totalRoles() {
        return roles.size();
    }
}
