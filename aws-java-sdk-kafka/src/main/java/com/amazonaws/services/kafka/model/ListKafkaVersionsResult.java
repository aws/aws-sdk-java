/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListKafkaVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKafkaVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<KafkaVersion> kafkaVersions;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<KafkaVersion> getKafkaVersions() {
        return kafkaVersions;
    }

    /**
     * @param kafkaVersions
     */

    public void setKafkaVersions(java.util.Collection<KafkaVersion> kafkaVersions) {
        if (kafkaVersions == null) {
            this.kafkaVersions = null;
            return;
        }

        this.kafkaVersions = new java.util.ArrayList<KafkaVersion>(kafkaVersions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKafkaVersions(java.util.Collection)} or {@link #withKafkaVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param kafkaVersions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKafkaVersionsResult withKafkaVersions(KafkaVersion... kafkaVersions) {
        if (this.kafkaVersions == null) {
            setKafkaVersions(new java.util.ArrayList<KafkaVersion>(kafkaVersions.length));
        }
        for (KafkaVersion ele : kafkaVersions) {
            this.kafkaVersions.add(ele);
        }
        return this;
    }

    /**
     * @param kafkaVersions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKafkaVersionsResult withKafkaVersions(java.util.Collection<KafkaVersion> kafkaVersions) {
        setKafkaVersions(kafkaVersions);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKafkaVersionsResult withNextToken(String nextToken) {
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
        if (getKafkaVersions() != null)
            sb.append("KafkaVersions: ").append(getKafkaVersions()).append(",");
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

        if (obj instanceof ListKafkaVersionsResult == false)
            return false;
        ListKafkaVersionsResult other = (ListKafkaVersionsResult) obj;
        if (other.getKafkaVersions() == null ^ this.getKafkaVersions() == null)
            return false;
        if (other.getKafkaVersions() != null && other.getKafkaVersions().equals(this.getKafkaVersions()) == false)
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

        hashCode = prime * hashCode + ((getKafkaVersions() == null) ? 0 : getKafkaVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKafkaVersionsResult clone() {
        try {
            return (ListKafkaVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
