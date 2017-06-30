package com.app;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class OperationTest {

    private Operation operation;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        operation = new Operation();
        operation.setOperand1(8.0);
        operation.setOperand2(4.0);
    }

    @Test
    public void compute_shouldProperlyPerformAdditionOperation() throws Exception {
        operation.setOperator("+");
        double result = operation.compute();
        assertThat(result, is(12.0));
    }

    @Test
    public void compute_shouldProperlyPerformSubtractionOperation() throws Exception {
        operation.setOperator("-");
        double result = operation.compute();
        assertThat(result, is(4.0));
    }

    @Test
    public void compute_shouldProperlyPerformMultiplicationOperation() throws Exception {
        operation.setOperator("*");
        double result = operation.compute();
        assertThat(result, is(32.0));
    }

    @Test
    public void compute_shouldProperlyPerformDivisionOperation() throws Exception {
        operation.setOperator("/");
        double result = operation.compute();
        assertThat(result, is(2.0));
    }

    @Test
    public void compute_shouldThrowIllegalArgumentExceptionWithUnrecognizedOperators() throws Exception {
        operation.setOperator("^");
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Unrecognized operator: " + operation.getOperator());
        operation.compute();
    }
}
