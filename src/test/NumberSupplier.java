package test;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Do Minh Toan on 6/4/2016.
 */
public class NumberSupplier extends ParameterSupplier {
    @Override
    public List<PotentialAssignment>
    getValueSources(ParameterSignature sig) {
        List<PotentialAssignment> list = new
                ArrayList<PotentialAssignment>();
        list.add(PotentialAssignment.forValue("long", 2L));
        list.add(PotentialAssignment.forValue("float", 5.00f));
        list.add(PotentialAssignment.forValue("double", 89d));
        return list;
    }
}