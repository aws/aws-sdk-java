/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;

/**
 * Condition
 */
public class Condition {

    /**
     * A list of attribute values to be used with a comparison operator for a
     * scan or query operation. For comparisons that require more than one
     * value, such as a <code>BETWEEN</code> comparison, the
     * AttributeValueList contains two attribute values and the comparison
     * operator.
     */
    private java.util.List<AttributeValue> attributeValueList;

    /**
     * A comparison operator is an enumeration of several operations: <ul>
     * <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     * <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     * matches.</li> <li><code>LE</code> for <em>less than or equal
     * to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     * <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     * <li><code>GT</code> for <em>greater than</em>.</li>
     * <li><code>BETWEEN</code> for <em>between</em>.</li>
     * <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     * <li><code>NULL</code> for <em>not exists</em>.</li>
     * <li><code>CONTAINS</code> for substring or value in a set.</li>
     * <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     * a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     * prefix.</li> </ul> <p>Scan operations support all available comparison
     * operators. <p>Query operations support a subset of the available
     * comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     */
    private String comparisonOperator;

    /**
     * Default constructor for a new Condition object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Condition() {}
    
    /**
     * A list of attribute values to be used with a comparison operator for a
     * scan or query operation. For comparisons that require more than one
     * value, such as a <code>BETWEEN</code> comparison, the
     * AttributeValueList contains two attribute values and the comparison
     * operator.
     *
     * @return A list of attribute values to be used with a comparison operator for a
     *         scan or query operation. For comparisons that require more than one
     *         value, such as a <code>BETWEEN</code> comparison, the
     *         AttributeValueList contains two attribute values and the comparison
     *         operator.
     */
    public java.util.List<AttributeValue> getAttributeValueList() {
        
        return attributeValueList;
    }
    
    /**
     * A list of attribute values to be used with a comparison operator for a
     * scan or query operation. For comparisons that require more than one
     * value, such as a <code>BETWEEN</code> comparison, the
     * AttributeValueList contains two attribute values and the comparison
     * operator.
     *
     * @param attributeValueList A list of attribute values to be used with a comparison operator for a
     *         scan or query operation. For comparisons that require more than one
     *         value, such as a <code>BETWEEN</code> comparison, the
     *         AttributeValueList contains two attribute values and the comparison
     *         operator.
     */
    public void setAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
            return;
        }

        java.util.List<AttributeValue> attributeValueListCopy = new java.util.ArrayList<AttributeValue>(attributeValueList.size());
        attributeValueListCopy.addAll(attributeValueList);
        this.attributeValueList = attributeValueListCopy;
    }
    
    /**
     * A list of attribute values to be used with a comparison operator for a
     * scan or query operation. For comparisons that require more than one
     * value, such as a <code>BETWEEN</code> comparison, the
     * AttributeValueList contains two attribute values and the comparison
     * operator.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList A list of attribute values to be used with a comparison operator for a
     *         scan or query operation. For comparisons that require more than one
     *         value, such as a <code>BETWEEN</code> comparison, the
     *         AttributeValueList contains two attribute values and the comparison
     *         operator.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Condition withAttributeValueList(AttributeValue... attributeValueList) {
        if (getAttributeValueList() == null) setAttributeValueList(new java.util.ArrayList<AttributeValue>(attributeValueList.length));
        for (AttributeValue value : attributeValueList) {
            getAttributeValueList().add(value);
        }
        return this;
    }
    
    /**
     * A list of attribute values to be used with a comparison operator for a
     * scan or query operation. For comparisons that require more than one
     * value, such as a <code>BETWEEN</code> comparison, the
     * AttributeValueList contains two attribute values and the comparison
     * operator.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList A list of attribute values to be used with a comparison operator for a
     *         scan or query operation. For comparisons that require more than one
     *         value, such as a <code>BETWEEN</code> comparison, the
     *         AttributeValueList contains two attribute values and the comparison
     *         operator.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Condition withAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
        } else {
            java.util.List<AttributeValue> attributeValueListCopy = new java.util.ArrayList<AttributeValue>(attributeValueList.size());
            attributeValueListCopy.addAll(attributeValueList);
            this.attributeValueList = attributeValueListCopy;
        }

        return this;
    }
    
    /**
     * A comparison operator is an enumeration of several operations: <ul>
     * <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     * <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     * matches.</li> <li><code>LE</code> for <em>less than or equal
     * to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     * <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     * <li><code>GT</code> for <em>greater than</em>.</li>
     * <li><code>BETWEEN</code> for <em>between</em>.</li>
     * <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     * <li><code>NULL</code> for <em>not exists</em>.</li>
     * <li><code>CONTAINS</code> for substring or value in a set.</li>
     * <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     * a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     * prefix.</li> </ul> <p>Scan operations support all available comparison
     * operators. <p>Query operations support a subset of the available
     * comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @return A comparison operator is an enumeration of several operations: <ul>
     *         <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     *         <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     *         matches.</li> <li><code>LE</code> for <em>less than or equal
     *         to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     *         <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     *         <li><code>GT</code> for <em>greater than</em>.</li>
     *         <li><code>BETWEEN</code> for <em>between</em>.</li>
     *         <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     *         <li><code>NULL</code> for <em>not exists</em>.</li>
     *         <li><code>CONTAINS</code> for substring or value in a set.</li>
     *         <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     *         a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     *         prefix.</li> </ul> <p>Scan operations support all available comparison
     *         operators. <p>Query operations support a subset of the available
     *         comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     *
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }
    
    /**
     * A comparison operator is an enumeration of several operations: <ul>
     * <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     * <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     * matches.</li> <li><code>LE</code> for <em>less than or equal
     * to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     * <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     * <li><code>GT</code> for <em>greater than</em>.</li>
     * <li><code>BETWEEN</code> for <em>between</em>.</li>
     * <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     * <li><code>NULL</code> for <em>not exists</em>.</li>
     * <li><code>CONTAINS</code> for substring or value in a set.</li>
     * <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     * a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     * prefix.</li> </ul> <p>Scan operations support all available comparison
     * operators. <p>Query operations support a subset of the available
     * comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparison operator is an enumeration of several operations: <ul>
     *         <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     *         <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     *         matches.</li> <li><code>LE</code> for <em>less than or equal
     *         to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     *         <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     *         <li><code>GT</code> for <em>greater than</em>.</li>
     *         <li><code>BETWEEN</code> for <em>between</em>.</li>
     *         <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     *         <li><code>NULL</code> for <em>not exists</em>.</li>
     *         <li><code>CONTAINS</code> for substring or value in a set.</li>
     *         <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     *         a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     *         prefix.</li> </ul> <p>Scan operations support all available comparison
     *         operators. <p>Query operations support a subset of the available
     *         comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }
    
    /**
     * A comparison operator is an enumeration of several operations: <ul>
     * <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     * <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     * matches.</li> <li><code>LE</code> for <em>less than or equal
     * to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     * <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     * <li><code>GT</code> for <em>greater than</em>.</li>
     * <li><code>BETWEEN</code> for <em>between</em>.</li>
     * <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     * <li><code>NULL</code> for <em>not exists</em>.</li>
     * <li><code>CONTAINS</code> for substring or value in a set.</li>
     * <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     * a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     * prefix.</li> </ul> <p>Scan operations support all available comparison
     * operators. <p>Query operations support a subset of the available
     * comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparison operator is an enumeration of several operations: <ul>
     *         <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     *         <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     *         matches.</li> <li><code>LE</code> for <em>less than or equal
     *         to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     *         <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     *         <li><code>GT</code> for <em>greater than</em>.</li>
     *         <li><code>BETWEEN</code> for <em>between</em>.</li>
     *         <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     *         <li><code>NULL</code> for <em>not exists</em>.</li>
     *         <li><code>CONTAINS</code> for substring or value in a set.</li>
     *         <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     *         a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     *         prefix.</li> </ul> <p>Scan operations support all available comparison
     *         operators. <p>Query operations support a subset of the available
     *         comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ComparisonOperator
     */
    public Condition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    
    
    /**
     * A comparison operator is an enumeration of several operations: <ul>
     * <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     * <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     * matches.</li> <li><code>LE</code> for <em>less than or equal
     * to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     * <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     * <li><code>GT</code> for <em>greater than</em>.</li>
     * <li><code>BETWEEN</code> for <em>between</em>.</li>
     * <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     * <li><code>NULL</code> for <em>not exists</em>.</li>
     * <li><code>CONTAINS</code> for substring or value in a set.</li>
     * <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     * a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     * prefix.</li> </ul> <p>Scan operations support all available comparison
     * operators. <p>Query operations support a subset of the available
     * comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparison operator is an enumeration of several operations: <ul>
     *         <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     *         <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     *         matches.</li> <li><code>LE</code> for <em>less than or equal
     *         to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     *         <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     *         <li><code>GT</code> for <em>greater than</em>.</li>
     *         <li><code>BETWEEN</code> for <em>between</em>.</li>
     *         <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     *         <li><code>NULL</code> for <em>not exists</em>.</li>
     *         <li><code>CONTAINS</code> for substring or value in a set.</li>
     *         <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     *         a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     *         prefix.</li> </ul> <p>Scan operations support all available comparison
     *         operators. <p>Query operations support a subset of the available
     *         comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }
    
    /**
     * A comparison operator is an enumeration of several operations: <ul>
     * <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     * <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     * matches.</li> <li><code>LE</code> for <em>less than or equal
     * to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     * <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     * <li><code>GT</code> for <em>greater than</em>.</li>
     * <li><code>BETWEEN</code> for <em>between</em>.</li>
     * <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     * <li><code>NULL</code> for <em>not exists</em>.</li>
     * <li><code>CONTAINS</code> for substring or value in a set.</li>
     * <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     * a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     * prefix.</li> </ul> <p>Scan operations support all available comparison
     * operators. <p>Query operations support a subset of the available
     * comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparison operator is an enumeration of several operations: <ul>
     *         <li><code>EQ</code> for <em>equal</em>.</li> <li><code>NE</code> for
     *         <em>not equal</em>.</li> <li><code>IN</code> checks for exact
     *         matches.</li> <li><code>LE</code> for <em>less than or equal
     *         to</em>.</li> <li><code>LT</code> for <em>less than</em>.</li>
     *         <li><code>GE</code> for <em>greater than or equal to</em>.</li>
     *         <li><code>GT</code> for <em>greater than</em>.</li>
     *         <li><code>BETWEEN</code> for <em>between</em>.</li>
     *         <li><code>NOT_NULL</code> for <em>exists</em>.</li>
     *         <li><code>NULL</code> for <em>not exists</em>.</li>
     *         <li><code>CONTAINS</code> for substring or value in a set.</li>
     *         <li><code>NOT_CONTAINS</code> for absence of a substring or absence of
     *         a value in a set.</li> <li><code>BEGINS_WITH</code> for a substring
     *         prefix.</li> </ul> <p>Scan operations support all available comparison
     *         operators. <p>Query operations support a subset of the available
     *         comparison operators: EQ, LE, LT, GE, GT, BETWEEN, and BEGINS_WITH.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ComparisonOperator
     */
    public Condition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (attributeValueList != null) sb.append("AttributeValueList: " + attributeValueList + ", ");
        if (comparisonOperator != null) sb.append("ComparisonOperator: " + comparisonOperator + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeValueList() == null) ? 0 : getAttributeValueList().hashCode()); 
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof Condition == false) return false;
        Condition other = (Condition)obj;
        
        if (other.getAttributeValueList() == null ^ this.getAttributeValueList() == null) return false;
        if (other.getAttributeValueList() != null && other.getAttributeValueList().equals(this.getAttributeValueList()) == false) return false; 
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null) return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false) return false; 
        return true;
    }
    
}
    