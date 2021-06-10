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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The identifier that identifies the batch of Records you are retrieving in a batch.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecordIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRecordIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>FeatureGroupName</code> containing Records you are retrieving in a batch.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The value for a list of record identifiers in string format.
     * </p>
     */
    private java.util.List<String> recordIdentifiersValueAsString;
    /**
     * <p>
     * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
     * </p>
     */
    private java.util.List<String> featureNames;

    /**
     * <p>
     * A <code>FeatureGroupName</code> containing Records you are retrieving in a batch.
     * </p>
     * 
     * @param featureGroupName
     *        A <code>FeatureGroupName</code> containing Records you are retrieving in a batch.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * A <code>FeatureGroupName</code> containing Records you are retrieving in a batch.
     * </p>
     * 
     * @return A <code>FeatureGroupName</code> containing Records you are retrieving in a batch.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * A <code>FeatureGroupName</code> containing Records you are retrieving in a batch.
     * </p>
     * 
     * @param featureGroupName
     *        A <code>FeatureGroupName</code> containing Records you are retrieving in a batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordIdentifier withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The value for a list of record identifiers in string format.
     * </p>
     * 
     * @return The value for a list of record identifiers in string format.
     */

    public java.util.List<String> getRecordIdentifiersValueAsString() {
        return recordIdentifiersValueAsString;
    }

    /**
     * <p>
     * The value for a list of record identifiers in string format.
     * </p>
     * 
     * @param recordIdentifiersValueAsString
     *        The value for a list of record identifiers in string format.
     */

    public void setRecordIdentifiersValueAsString(java.util.Collection<String> recordIdentifiersValueAsString) {
        if (recordIdentifiersValueAsString == null) {
            this.recordIdentifiersValueAsString = null;
            return;
        }

        this.recordIdentifiersValueAsString = new java.util.ArrayList<String>(recordIdentifiersValueAsString);
    }

    /**
     * <p>
     * The value for a list of record identifiers in string format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordIdentifiersValueAsString(java.util.Collection)} or
     * {@link #withRecordIdentifiersValueAsString(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recordIdentifiersValueAsString
     *        The value for a list of record identifiers in string format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordIdentifier withRecordIdentifiersValueAsString(String... recordIdentifiersValueAsString) {
        if (this.recordIdentifiersValueAsString == null) {
            setRecordIdentifiersValueAsString(new java.util.ArrayList<String>(recordIdentifiersValueAsString.length));
        }
        for (String ele : recordIdentifiersValueAsString) {
            this.recordIdentifiersValueAsString.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value for a list of record identifiers in string format.
     * </p>
     * 
     * @param recordIdentifiersValueAsString
     *        The value for a list of record identifiers in string format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordIdentifier withRecordIdentifiersValueAsString(java.util.Collection<String> recordIdentifiersValueAsString) {
        setRecordIdentifiersValueAsString(recordIdentifiersValueAsString);
        return this;
    }

    /**
     * <p>
     * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
     * </p>
     * 
     * @return List of names of Features to be retrieved. If not specified, the latest value for all the Features are
     *         returned.
     */

    public java.util.List<String> getFeatureNames() {
        return featureNames;
    }

    /**
     * <p>
     * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
     * </p>
     * 
     * @param featureNames
     *        List of names of Features to be retrieved. If not specified, the latest value for all the Features are
     *        returned.
     */

    public void setFeatureNames(java.util.Collection<String> featureNames) {
        if (featureNames == null) {
            this.featureNames = null;
            return;
        }

        this.featureNames = new java.util.ArrayList<String>(featureNames);
    }

    /**
     * <p>
     * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureNames(java.util.Collection)} or {@link #withFeatureNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureNames
     *        List of names of Features to be retrieved. If not specified, the latest value for all the Features are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordIdentifier withFeatureNames(String... featureNames) {
        if (this.featureNames == null) {
            setFeatureNames(new java.util.ArrayList<String>(featureNames.length));
        }
        for (String ele : featureNames) {
            this.featureNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
     * </p>
     * 
     * @param featureNames
     *        List of names of Features to be retrieved. If not specified, the latest value for all the Features are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordIdentifier withFeatureNames(java.util.Collection<String> featureNames) {
        setFeatureNames(featureNames);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getRecordIdentifiersValueAsString() != null)
            sb.append("RecordIdentifiersValueAsString: ").append(getRecordIdentifiersValueAsString()).append(",");
        if (getFeatureNames() != null)
            sb.append("FeatureNames: ").append(getFeatureNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRecordIdentifier == false)
            return false;
        BatchGetRecordIdentifier other = (BatchGetRecordIdentifier) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getRecordIdentifiersValueAsString() == null ^ this.getRecordIdentifiersValueAsString() == null)
            return false;
        if (other.getRecordIdentifiersValueAsString() != null
                && other.getRecordIdentifiersValueAsString().equals(this.getRecordIdentifiersValueAsString()) == false)
            return false;
        if (other.getFeatureNames() == null ^ this.getFeatureNames() == null)
            return false;
        if (other.getFeatureNames() != null && other.getFeatureNames().equals(this.getFeatureNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getRecordIdentifiersValueAsString() == null) ? 0 : getRecordIdentifiersValueAsString().hashCode());
        hashCode = prime * hashCode + ((getFeatureNames() == null) ? 0 : getFeatureNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRecordIdentifier clone() {
        try {
            return (BatchGetRecordIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.BatchGetRecordIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
