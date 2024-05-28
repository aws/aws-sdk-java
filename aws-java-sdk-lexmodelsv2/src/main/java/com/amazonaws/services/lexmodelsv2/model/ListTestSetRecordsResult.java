/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestSetRecords" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestSetRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of records from the test set.
     * </p>
     */
    private java.util.List<TestSetTurnRecord> testSetRecords;
    /**
     * <p>
     * A token that indicates whether there are more records to return in a response to the ListTestSetRecords
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestSetRecords operation request to get the next page of records.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of records from the test set.
     * </p>
     * 
     * @return The list of records from the test set.
     */

    public java.util.List<TestSetTurnRecord> getTestSetRecords() {
        return testSetRecords;
    }

    /**
     * <p>
     * The list of records from the test set.
     * </p>
     * 
     * @param testSetRecords
     *        The list of records from the test set.
     */

    public void setTestSetRecords(java.util.Collection<TestSetTurnRecord> testSetRecords) {
        if (testSetRecords == null) {
            this.testSetRecords = null;
            return;
        }

        this.testSetRecords = new java.util.ArrayList<TestSetTurnRecord>(testSetRecords);
    }

    /**
     * <p>
     * The list of records from the test set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestSetRecords(java.util.Collection)} or {@link #withTestSetRecords(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param testSetRecords
     *        The list of records from the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetRecordsResult withTestSetRecords(TestSetTurnRecord... testSetRecords) {
        if (this.testSetRecords == null) {
            setTestSetRecords(new java.util.ArrayList<TestSetTurnRecord>(testSetRecords.length));
        }
        for (TestSetTurnRecord ele : testSetRecords) {
            this.testSetRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of records from the test set.
     * </p>
     * 
     * @param testSetRecords
     *        The list of records from the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetRecordsResult withTestSetRecords(java.util.Collection<TestSetTurnRecord> testSetRecords) {
        setTestSetRecords(testSetRecords);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more records to return in a response to the ListTestSetRecords
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestSetRecords operation request to get the next page of records.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more records to return in a response to the ListTestSetRecords
     *        operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *        ListTestSetRecords operation request to get the next page of records.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more records to return in a response to the ListTestSetRecords
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestSetRecords operation request to get the next page of records.
     * </p>
     * 
     * @return A token that indicates whether there are more records to return in a response to the ListTestSetRecords
     *         operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *         ListTestSetRecords operation request to get the next page of records.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more records to return in a response to the ListTestSetRecords
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListTestSetRecords operation request to get the next page of records.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more records to return in a response to the ListTestSetRecords
     *        operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     *        ListTestSetRecords operation request to get the next page of records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSetRecordsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTestSetRecords() != null)
            sb.append("TestSetRecords: ").append(getTestSetRecords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTestSetRecordsResult == false)
            return false;
        ListTestSetRecordsResult other = (ListTestSetRecordsResult) obj;
        if (other.getTestSetRecords() == null ^ this.getTestSetRecords() == null)
            return false;
        if (other.getTestSetRecords() != null && other.getTestSetRecords().equals(this.getTestSetRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetRecords() == null) ? 0 : getTestSetRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestSetRecordsResult clone() {
        try {
            return (ListTestSetRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
