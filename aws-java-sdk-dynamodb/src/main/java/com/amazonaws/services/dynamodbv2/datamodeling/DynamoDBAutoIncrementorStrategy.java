package com.amazonaws.services.dynamodbv2.datamodeling;

/**
 * Defines the strategy for incrementing atomically those DB fields we want to only ever increment via the applied value
 * instead of using the DynamoDBMapperConfig#APPEND_SET.
 *
 * In this use-case we don't want the possibility of someone stomping on the attribute's value and we only ever want
 * this value to be written when we're incrementing then use this annotation to drive the increment behavior.
 *
 * Created by matt@mjgreenwood.net on 3/3/17.
 */
public class DynamoDBAutoIncrementorStrategy {
    private double incrBy;

    public DynamoDBAutoIncrementorStrategy(double incr) {
        this.incrBy = incr;
    }

    public Number getIncrBy() {
        return incrBy;
    }

    public void setIncrBy(double incrBy) {
        this.incrBy = incrBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamoDBAutoIncrementorStrategy that = (DynamoDBAutoIncrementorStrategy) o;

        return Double.compare(that.incrBy, incrBy) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(incrBy);
        return (int) (temp ^ (temp >>> 32));
    }
}
