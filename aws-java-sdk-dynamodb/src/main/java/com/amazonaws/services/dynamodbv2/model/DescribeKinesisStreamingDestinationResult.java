/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeKinesisStreamingDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKinesisStreamingDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the table being described.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The list of replica structures for the table being described.
     * </p>
     */
    private java.util.List<KinesisDataStreamDestination> kinesisDataStreamDestinations;

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * 
     * @param tableName
     *        The name of the table being described.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * 
     * @return The name of the table being described.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table being described.
     * </p>
     * 
     * @param tableName
     *        The name of the table being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKinesisStreamingDestinationResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The list of replica structures for the table being described.
     * </p>
     * 
     * @return The list of replica structures for the table being described.
     */

    public java.util.List<KinesisDataStreamDestination> getKinesisDataStreamDestinations() {
        return kinesisDataStreamDestinations;
    }

    /**
     * <p>
     * The list of replica structures for the table being described.
     * </p>
     * 
     * @param kinesisDataStreamDestinations
     *        The list of replica structures for the table being described.
     */

    public void setKinesisDataStreamDestinations(java.util.Collection<KinesisDataStreamDestination> kinesisDataStreamDestinations) {
        if (kinesisDataStreamDestinations == null) {
            this.kinesisDataStreamDestinations = null;
            return;
        }

        this.kinesisDataStreamDestinations = new java.util.ArrayList<KinesisDataStreamDestination>(kinesisDataStreamDestinations);
    }

    /**
     * <p>
     * The list of replica structures for the table being described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKinesisDataStreamDestinations(java.util.Collection)} or
     * {@link #withKinesisDataStreamDestinations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param kinesisDataStreamDestinations
     *        The list of replica structures for the table being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKinesisStreamingDestinationResult withKinesisDataStreamDestinations(KinesisDataStreamDestination... kinesisDataStreamDestinations) {
        if (this.kinesisDataStreamDestinations == null) {
            setKinesisDataStreamDestinations(new java.util.ArrayList<KinesisDataStreamDestination>(kinesisDataStreamDestinations.length));
        }
        for (KinesisDataStreamDestination ele : kinesisDataStreamDestinations) {
            this.kinesisDataStreamDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of replica structures for the table being described.
     * </p>
     * 
     * @param kinesisDataStreamDestinations
     *        The list of replica structures for the table being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKinesisStreamingDestinationResult withKinesisDataStreamDestinations(
            java.util.Collection<KinesisDataStreamDestination> kinesisDataStreamDestinations) {
        setKinesisDataStreamDestinations(kinesisDataStreamDestinations);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getKinesisDataStreamDestinations() != null)
            sb.append("KinesisDataStreamDestinations: ").append(getKinesisDataStreamDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKinesisStreamingDestinationResult == false)
            return false;
        DescribeKinesisStreamingDestinationResult other = (DescribeKinesisStreamingDestinationResult) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getKinesisDataStreamDestinations() == null ^ this.getKinesisDataStreamDestinations() == null)
            return false;
        if (other.getKinesisDataStreamDestinations() != null
                && other.getKinesisDataStreamDestinations().equals(this.getKinesisDataStreamDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getKinesisDataStreamDestinations() == null) ? 0 : getKinesisDataStreamDestinations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKinesisStreamingDestinationResult clone() {
        try {
            return (DescribeKinesisStreamingDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
