import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vector {
    int dimension;
    List<Double> values;

    public Vector(int dimension) {
        this.dimension = dimension;
        values = new ArrayList<Double>();
        for (int i = 0; i < dimension; i++) {
            values.add(0.00);
        }
    }

    public Vector(int dimension, Double[] doubleArray) {
        this.dimension = dimension;
        values = Arrays.asList(doubleArray);
    }

    public Vector scale(double scalar) {
        for (int i = 0; i < dimension; i++) {
            values.set(i, values.get(i) * scalar);
        }
        return this;
    }

    public Vector add(Vector addend) {
        if (dimension != addend.getDimension()) {
            System.out.println("ERROR: Size Mismatch!");
            return null;
        } else {
            List<Double> temp = addend.getValues();
            for (int i = 0; i < dimension; i++) {
                values.set(i, values.get(i) + temp.get(i));
            }
            return this;
        }
    }

    public static Vector gauss_jordan(List<Vector> vectors, int dimension, Vector constants) {
        Vector v = null;

        // change list to matrix
        // counter = 1
        // a sort matrix
        // b divide each row by first element of each row
        // c rows more than 1, multiply -1
        // d add rows more than 1 from row 1
        // e counter ++
        // repeat

        return v;
    }

    public static int span(List<Vector> vectors, int dimension) {
        int span = 0;

        gauss_jordan(vectors, dimension, new Vector(dimension));

        boolean flag = false;
        for (int i = 0; i < dimension; i++) {
            for (Vector v: vectors) {
                if (v.getIndex(i) != 0) {
                    flag = true;
                }
            }
            if (flag) {
                span++;
            }
            flag = false;
        }
        return span;
    }

    // for bug fixing only. remove after confirmed bug-free
    public void print() {
        for (Double d: values) {
            System.out.println(d);
        }
    }

    public double getIndex(int index) {
        return values.get(index);
    }

    public int getDimension() {
        return dimension;
    }

    public List<Double> getValues() {
        return values;
    }
}
