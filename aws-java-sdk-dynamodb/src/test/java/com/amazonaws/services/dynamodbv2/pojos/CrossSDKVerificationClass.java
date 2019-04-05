/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBVersionAttribute;

/**
 * Exhaustive exercise of DynamoDB domain mapping, exercising every supported
 * data type.
 */
@DynamoDBTable(tableName = "aws-xsdk")
public class CrossSDKVerificationClass {

    private String key;
    private String rangeKey;
    private Long version;
    private String lastUpdater;

    private Integer integerAttribute;
    private Long longAttribute;
    private Double doubleAttribute;
    private Float floatAttribute;
    private BigDecimal bigDecimalAttribute;
    private BigInteger bigIntegerAttribute;
    private Byte byteAttribute;
    private Date dateAttribute;
    private Calendar calendarAttribute;
    private Boolean booleanAttribute;

    private Set<String> stringSetAttribute;
    private Set<Integer> integerSetAttribute;
    private Set<Double> doubleSetAttribute;
    private Set<Float> floatSetAttribute;
    private Set<BigDecimal> bigDecimalSetAttribute;
    private Set<BigInteger> bigIntegerSetAttribute;
    private Set<Long> longSetAttribute;
    private Set<Byte> byteSetAttribute;
    private Set<Date> dateSetAttribute;
    private Set<Calendar> calendarSetAttribute;

    // these are kind of pointless, but here for completeness
    private Set<Boolean> booleanSetAttribute;

    @DynamoDBHashKey
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @DynamoDBRangeKey
    public String getRangeKey() {
        return rangeKey;
    }

    public void setRangeKey(String rangeKey) {
        this.rangeKey = rangeKey;
    }

    @DynamoDBVersionAttribute
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getLastUpdater() {
        return lastUpdater;
    }

    public void setLastUpdater(String lastUpdater) {
        this.lastUpdater = lastUpdater;
    }

    public Integer getIntegerAttribute() {
        return integerAttribute;
    }

    public void setIntegerAttribute(Integer integerAttribute) {
        this.integerAttribute = integerAttribute;
    }

    public Long getLongAttribute() {
        return longAttribute;
    }

    public void setLongAttribute(Long longAttribute) {
        this.longAttribute = longAttribute;
    }

    public Double getDoubleAttribute() {
        return doubleAttribute;
    }

    public void setDoubleAttribute(Double doubleAttribute) {
        this.doubleAttribute = doubleAttribute;
    }

    public Float getFloatAttribute() {
        return floatAttribute;
    }

    public void setFloatAttribute(Float floatAttribute) {
        this.floatAttribute = floatAttribute;
    }

    public BigDecimal getBigDecimalAttribute() {
        return bigDecimalAttribute;
    }

    public void setBigDecimalAttribute(BigDecimal bigDecimalAttribute) {
        this.bigDecimalAttribute = bigDecimalAttribute;
    }

    public BigInteger getBigIntegerAttribute() {
        return bigIntegerAttribute;
    }

    public void setBigIntegerAttribute(BigInteger bigIntegerAttribute) {
        this.bigIntegerAttribute = bigIntegerAttribute;
    }

    public Byte getByteAttribute() {
        return byteAttribute;
    }

    public void setByteAttribute(Byte byteAttribute) {
        this.byteAttribute = byteAttribute;
    }

    public Date getDateAttribute() {
        return dateAttribute;
    }

    public void setDateAttribute(Date dateAttribute) {
        this.dateAttribute = dateAttribute;
    }

    public Calendar getCalendarAttribute() {
        return calendarAttribute;
    }

    public void setCalendarAttribute(Calendar calendarAttribute) {
        this.calendarAttribute = calendarAttribute;
    }

    public Boolean getBooleanAttribute() {
        return booleanAttribute;
    }

    public void setBooleanAttribute(Boolean booleanAttribute) {
        this.booleanAttribute = booleanAttribute;
    }

    public Set<Integer> getIntegerSetAttribute() {
        return integerSetAttribute;
    }

    public void setIntegerSetAttribute(Set<Integer> integerSetAttribute) {
        this.integerSetAttribute = integerSetAttribute;
    }

    public Set<Double> getDoubleSetAttribute() {
        return doubleSetAttribute;
    }

    public void setDoubleSetAttribute(Set<Double> doubleSetAttribute) {
        this.doubleSetAttribute = doubleSetAttribute;
    }

    public Set<Float> getFloatSetAttribute() {
        return floatSetAttribute;
    }

    public void setFloatSetAttribute(Set<Float> floatSetAttribute) {
        this.floatSetAttribute = floatSetAttribute;
    }

    public Set<BigDecimal> getBigDecimalSetAttribute() {
        return bigDecimalSetAttribute;
    }

    public void setBigDecimalSetAttribute(Set<BigDecimal> bigDecimalSetAttribute) {
        this.bigDecimalSetAttribute = bigDecimalSetAttribute;
    }

    public Set<BigInteger> getBigIntegerSetAttribute() {
        return bigIntegerSetAttribute;
    }

    public void setBigIntegerSetAttribute(Set<BigInteger> bigIntegerSetAttribute) {
        this.bigIntegerSetAttribute = bigIntegerSetAttribute;
    }

    public Set<Long> getLongSetAttribute() {
        return longSetAttribute;
    }

    public void setLongSetAttribute(Set<Long> longSetAttribute) {
        this.longSetAttribute = longSetAttribute;
    }

    public Set<Byte> getByteSetAttribute() {
        return byteSetAttribute;
    }

    public void setByteSetAttribute(Set<Byte> byteSetAttribute) {
        this.byteSetAttribute = byteSetAttribute;
    }

    public Set<Date> getDateSetAttribute() {
        return dateSetAttribute;
    }

    public void setDateSetAttribute(Set<Date> dateSetAttribute) {
        this.dateSetAttribute = dateSetAttribute;
    }

    public Set<Calendar> getCalendarSetAttribute() {
        return calendarSetAttribute;
    }

    public void setCalendarSetAttribute(Set<Calendar> calendarSetAttribute) {
        this.calendarSetAttribute = calendarSetAttribute;
    }

    public Set<Boolean> getBooleanSetAttribute() {
        return booleanSetAttribute;
    }

    public void setBooleanSetAttribute(Set<Boolean> booleanSetAttribute) {
        this.booleanSetAttribute = booleanSetAttribute;
    }

    public Set<String> getStringSetAttribute() {
        return stringSetAttribute;
    }

    public void setStringSetAttribute(Set<String> stringSetAttribute) {
        this.stringSetAttribute = stringSetAttribute;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bigDecimalAttribute == null) ? 0 : bigDecimalAttribute.hashCode());
        result = prime * result + ((bigDecimalSetAttribute == null) ? 0 : bigDecimalSetAttribute.hashCode());
        result = prime * result + ((bigIntegerAttribute == null) ? 0 : bigIntegerAttribute.hashCode());
        result = prime * result + ((bigIntegerSetAttribute == null) ? 0 : bigIntegerSetAttribute.hashCode());
        result = prime * result + ((booleanAttribute == null) ? 0 : booleanAttribute.hashCode());
        result = prime * result + ((booleanSetAttribute == null) ? 0 : booleanSetAttribute.hashCode());
        result = prime * result + ((byteAttribute == null) ? 0 : byteAttribute.hashCode());
        result = prime * result + ((byteSetAttribute == null) ? 0 : byteSetAttribute.hashCode());
        result = prime * result + ((calendarAttribute == null) ? 0 : calendarAttribute.hashCode());
        result = prime * result + ((calendarSetAttribute == null) ? 0 : calendarSetAttribute.hashCode());
        result = prime * result + ((dateAttribute == null) ? 0 : dateAttribute.hashCode());
        result = prime * result + ((dateSetAttribute == null) ? 0 : dateSetAttribute.hashCode());
        result = prime * result + ((doubleAttribute == null) ? 0 : doubleAttribute.hashCode());
        result = prime * result + ((doubleSetAttribute == null) ? 0 : doubleSetAttribute.hashCode());
        result = prime * result + ((floatAttribute == null) ? 0 : floatAttribute.hashCode());
        result = prime * result + ((floatSetAttribute == null) ? 0 : floatSetAttribute.hashCode());
        result = prime * result + ((integerAttribute == null) ? 0 : integerAttribute.hashCode());
        result = prime * result + ((integerSetAttribute == null) ? 0 : integerSetAttribute.hashCode());
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((lastUpdater == null) ? 0 : lastUpdater.hashCode());
        result = prime * result + ((longAttribute == null) ? 0 : longAttribute.hashCode());
        result = prime * result + ((longSetAttribute == null) ? 0 : longSetAttribute.hashCode());
        result = prime * result + ((rangeKey == null) ? 0 : rangeKey.hashCode());
        result = prime * result + ((stringSetAttribute == null) ? 0 : stringSetAttribute.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        CrossSDKVerificationClass other = (CrossSDKVerificationClass) obj;
        if ( bigDecimalAttribute == null ) {
            if ( other.bigDecimalAttribute != null )
                return false;
        } else if ( !bigDecimalAttribute.equals(other.bigDecimalAttribute) )
            return false;
        if ( bigDecimalSetAttribute == null ) {
            if ( other.bigDecimalSetAttribute != null )
                return false;
        } else if ( !bigDecimalSetAttribute.equals(other.bigDecimalSetAttribute) )
            return false;
        if ( bigIntegerAttribute == null ) {
            if ( other.bigIntegerAttribute != null )
                return false;
        } else if ( !bigIntegerAttribute.equals(other.bigIntegerAttribute) )
            return false;
        if ( bigIntegerSetAttribute == null ) {
            if ( other.bigIntegerSetAttribute != null )
                return false;
        } else if ( !bigIntegerSetAttribute.equals(other.bigIntegerSetAttribute) )
            return false;
        if ( booleanAttribute == null ) {
            if ( other.booleanAttribute != null )
                return false;
        } else if ( !booleanAttribute.equals(other.booleanAttribute) )
            return false;
        if ( booleanSetAttribute == null ) {
            if ( other.booleanSetAttribute != null )
                return false;
        } else if ( !booleanSetAttribute.equals(other.booleanSetAttribute) )
            return false;
        if ( byteAttribute == null ) {
            if ( other.byteAttribute != null )
                return false;
        } else if ( !byteAttribute.equals(other.byteAttribute) )
            return false;
        if ( byteSetAttribute == null ) {
            if ( other.byteSetAttribute != null )
                return false;
        } else if ( !byteSetAttribute.equals(other.byteSetAttribute) )
            return false;
        if ( calendarAttribute == null ) {
            if ( other.calendarAttribute != null )
                return false;
        } else if ( !calendarAttribute.equals(other.calendarAttribute) )
            return false;
        if ( calendarSetAttribute == null ) {
            if ( other.calendarSetAttribute != null )
                return false;
        } else if ( !calendarSetAttribute.equals(other.calendarSetAttribute) )
            return false;
        if ( dateAttribute == null ) {
            if ( other.dateAttribute != null )
                return false;
        } else if ( !dateAttribute.equals(other.dateAttribute) )
            return false;
        if ( dateSetAttribute == null ) {
            if ( other.dateSetAttribute != null )
                return false;
        } else if ( !dateSetAttribute.equals(other.dateSetAttribute) )
            return false;
        if ( doubleAttribute == null ) {
            if ( other.doubleAttribute != null )
                return false;
        } else if ( !doubleAttribute.equals(other.doubleAttribute) )
            return false;
        if ( doubleSetAttribute == null ) {
            if ( other.doubleSetAttribute != null )
                return false;
        } else if ( !doubleSetAttribute.equals(other.doubleSetAttribute) )
            return false;
        if ( floatAttribute == null ) {
            if ( other.floatAttribute != null )
                return false;
        } else if ( !floatAttribute.equals(other.floatAttribute) )
            return false;
        if ( floatSetAttribute == null ) {
            if ( other.floatSetAttribute != null )
                return false;
        } else if ( !floatSetAttribute.equals(other.floatSetAttribute) )
            return false;
        if ( integerAttribute == null ) {
            if ( other.integerAttribute != null )
                return false;
        } else if ( !integerAttribute.equals(other.integerAttribute) )
            return false;
        if ( integerSetAttribute == null ) {
            if ( other.integerSetAttribute != null )
                return false;
        } else if ( !integerSetAttribute.equals(other.integerSetAttribute) )
            return false;
        if ( key == null ) {
            if ( other.key != null )
                return false;
        } else if ( !key.equals(other.key) )
            return false;
        if ( lastUpdater == null ) {
            if ( other.lastUpdater != null )
                return false;
        } else if ( !lastUpdater.equals(other.lastUpdater) )
            return false;
        if ( longAttribute == null ) {
            if ( other.longAttribute != null )
                return false;
        } else if ( !longAttribute.equals(other.longAttribute) )
            return false;
        if ( longSetAttribute == null ) {
            if ( other.longSetAttribute != null )
                return false;
        } else if ( !longSetAttribute.equals(other.longSetAttribute) )
            return false;
        if ( rangeKey == null ) {
            if ( other.rangeKey != null )
                return false;
        } else if ( !rangeKey.equals(other.rangeKey) )
            return false;
        if ( stringSetAttribute == null ) {
            if ( other.stringSetAttribute != null )
                return false;
        } else if ( !stringSetAttribute.equals(other.stringSetAttribute) )
            return false;
        if ( version == null ) {
            if ( other.version != null )
                return false;
        } else if ( !version.equals(other.version) )
            return false;
        return true;
    }

}
