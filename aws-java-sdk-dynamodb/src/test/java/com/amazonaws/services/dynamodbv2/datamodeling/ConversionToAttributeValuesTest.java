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
package com.amazonaws.services.dynamodbv2.datamodeling;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ConversionToAttributeValuesTest {

    private DynamoDBMapperModelFactory models;
    private DynamoDBMapperConfig finalConfig;

    @Before
    public void setUp() throws Exception {
        finalConfig = new DynamoDBMapperConfig.Builder()
                .withTypeConverterFactory(DynamoDBMapperConfig.DEFAULT.getTypeConverterFactory())
                .withConversionSchema(ConversionSchemas.V2)
                .build();
        this.models = StandardModelFactories.of(S3Link.Factory.of(null));
    }

    @Test
    public void converterFailsForSubProperty() throws Exception {
        DynamoDBMapperTableModel<ConverterData> tableModel = getTable(ConverterData.class);
        Map<String, AttributeValue> withSubData = tableModel.convert(new ConverterData());
        assertEquals("bar", tableModel.unconvert(withSubData).getSubDocument().getaData().getValue());
    }


    private <T> DynamoDBMapperTableModel<T> getTable(Class<T> clazz) {
        return this.models.getTableFactory(finalConfig).getTable(clazz);
    }

    @DynamoDBTable(tableName = "test")
    public static class ConverterData {

        @DynamoDBHashKey
        private String key;

        @DynamoDBTypeConverted(converter = CustomDataConverter.class)
        CustomData customConverted;

        private ConverterSubDocument subDocument;

        public ConverterData() {
            customConverted = new CustomData("foo");
            subDocument = new ConverterSubDocument();
            subDocument.setaData(new CustomData("bar"));
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public ConverterSubDocument getSubDocument() {
            return subDocument;
        }

        public void setSubDocument(ConverterSubDocument subProperty) {
            this.subDocument = subProperty;
        }

        public CustomData getCustomConverted() {
            return customConverted;
        }

        public void setCustomConverted(CustomData customConverted) {
            this.customConverted = customConverted;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ConverterData that = (ConverterData) o;
            return ConversionToAttributeValuesTest.equals(subDocument, that.subDocument);
        }

        @Override
        public int hashCode() {
            return ConversionToAttributeValuesTest.hash(subDocument);
        }

    }

    @DynamoDBDocument
    public static class ConverterSubDocument {

        @DynamoDBTypeConverted(converter = CustomDataConverter.class)
        private CustomData aData;

        public CustomData getaData() {
            return aData;
        }

        public void setaData(CustomData aData) {
            this.aData = aData;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ConverterSubDocument that = (ConverterSubDocument) o;
            return ConversionToAttributeValuesTest.equals(aData, that.aData);
        }

        @Override
        public int hashCode() {
            return ConversionToAttributeValuesTest.hash(aData);
        }
    }


    public static class CustomData {

        private final String value;

        public CustomData(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CustomData that = (CustomData) o;
            return ConversionToAttributeValuesTest.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return ConversionToAttributeValuesTest.hash(value);
        }
    }

    public static class CustomDataConverter implements DynamoDBTypeConverter<String, CustomData> {

        public String convert(CustomData object) {
            return object.getValue();
        }

        public CustomData unconvert(String object) {
            return new CustomData(object);
        }
    }

    public static boolean equals(Object o1, Object o2) {
        if (o1 == o2) return true;
        if (o1 != null) {
            return o1.equals(o2);
        }
        return false;
    }

    public static int hash(Object... objs) {
        int hash = 7;
        for (int i = 0; i < objs.length; ++i) {
            hash = hash * 31 + objs[i].hashCode();
        }
        return hash;
    }
}
