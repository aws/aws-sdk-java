/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMarshalling;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBNativeBoolean;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.RandomUUIDMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.S3Link;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@DynamoDBTable(tableName="nonexisting-test-tablename")
public class TestClass {

    @DynamoDBHashKey
    public String getId() { return null; }
    public void setId(String id) { }

    public boolean getBoolean() { return false; }
    public void setBoolean(boolean value) { }

    public Boolean getBoxedBoolean() { return false; }
    public void setBoxedBoolean(Boolean value) { }

    @DynamoDBNativeBoolean
    public boolean getNativeBoolean() { return false; }
    public void setNativeBoolean(boolean value) { }

    public String getString() { return null; }
    public void setString(String value) { }

    public UUID getUuid() { return null; }
    public void setUuid(UUID u) { }

    @DynamoDBMarshalling(marshallerClass=RandomUUIDMarshaller.class)
    public String getCustomString() { return null; }
    public void setCustomString(String s) { }

    public Date getDate() { return null; }
    public void setDate(Date d) { }

    public Calendar getCalendar() { return null; }
    public void setCalendar(Calendar c) { }

    public byte getByte() { return 0; }
    public Byte getBoxedByte() { return 0; }
    public void setByte(byte b) { }
    public void setBoxedByte(Byte b) { }

    public short getShort() { return 0; }
    public Short getBoxedShort() { return 0; }
    public void setShort(short s) { }
    public void setBoxedShort(Short s) { }

    public int getInt() { return 0; }
    public Integer getBoxedInt() { return 0; }
    public void setInt(int i) { }
    public void setBoxedInt(Integer i) { }

    public long getLong() { return 0; }
    public Long getBoxedLong() { return 0l; }
    public void setLong(long l) { }
    public void setBoxedLong(Long l) { }

    public BigInteger getBigInt() { return BigInteger.ZERO; }
    public void setBigInt(BigInteger i) { }

    public float getFloat() { return 0; }
    public Float getBoxedFloat() { return 0f; }
    public void setFloat(float f) { }
    public void setBoxedFloat(Float f) { }

    public double getDouble() { return 0; }
    public Double getBoxedDouble() { return 0d; }
    public void setDouble(double d) { }
    public void setBoxedDouble(Double d) { }

    public BigDecimal getBigDecimal() { return BigDecimal.ZERO; }
    public void setBigDecimal(BigDecimal d) { }

    public byte[] getByteArray() { return null; }
    public void setByteArray(byte[] b) { }
    public ByteBuffer getByteBuffer() { return null; }
    public void setByteBuffer(ByteBuffer b) { }

    public Set<Boolean> getBooleanSet() { return null; }
    public void setBooleanSet(Set<Boolean> s) { }

    public Set<UUID> getUuidSet() { return null; }
    public void setUuidSet(Set<UUID> s) { }

    public Set<String> getStringSet() { return null; }
    public void setStringSet(Set<String> s) { }

    public Set<Date> getDateSet() { return null; }
    public void setDateSet(Set<Date> d) { }

    public Set<Calendar> getCalendarSet() { return null; }
    public void setCalendarSet(Set<Calendar> c) { }

    public Set<Byte> getByteSet() { return null; }
    public void setByteSet(Set<Byte> s) { }

    public Set<Short> getShortSet() { return null; }
    public void setShortSet(Set<Short> s) { }

    public Set<Integer> getIntSet() { return null; }
    public void setIntSet(Set<Integer> s) { }

    public Set<Long> getLongSet() { return null; }
    public void setLongSet(Set<Long> s) { }

    public Set<BigInteger> getBigIntegerSet() { return null; }
    public void setBigIntegerSet(Set<BigInteger> s) { }

    public Set<Float> getFloatSet() { return null; }
    public void setFloatSet(Set<Float> s) { }

    public Set<Double> getDoubleSet() { return null; }
    public void setDoubleSet(Set<Double> s) { }

    public Set<BigDecimal> getBigDecimalSet() { return null; }
    public void setBigDecimalSet(Set<BigDecimal> s) { }

    public Set<byte[]> getByteArraySet() { return null; }
    public void setByteArraySet(Set<byte[]> s) { }

    public Set<ByteBuffer> getByteBufferSet() { return null; }
    public void setByteBufferSet(Set<ByteBuffer> s) { }

    public Set<SubClass> getObjectSet() { return null; }
    public void setObjectSet(Set<SubClass> s) { }

    public List<String> getList() { return null; }
    public void setList(List<String> l) { }

    public List<SubClass> getObjectList() { return null; }
    public void setObjectList(List<SubClass> l) { }

    public List<Set<String>> getSetList() { return null; }
    public void setSetList(List<Set<String>> l) { }

    public Map<String, String> getMap() { return null; }
    public void setMap(Map<String, String> m) { }

    public Map<String, Set<String>> getSetMap() { return null; }
    public void setSetMap(Map<String, Set<String>> m) { }

    public Map<Object, Object> getBogusMap() { return null; }
    public void setBogusMap(Map<Object, Object> m) { }

    public SubClass getObject() { return null; }
    public void setObject(SubClass c) { }

    public S3Link getS3Link() { return null; }
    public void setS3Link(S3Link link) { }
}
