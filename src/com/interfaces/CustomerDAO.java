package com.interfaces;

import java.util.Collection;

/**
 * Created by Tempuser on 06.12.2017.
 */
// Интерфейс, который должны поддерживать все CustomerDAO
public interface CustomerDAO {
    public Collection getSprints(String nameOfProject);
}
