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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/GetRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the feature group in which you want to put the records.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The value that corresponds to <code>RecordIdentifier</code> type and uniquely identifies the record in the
     * <code>FeatureGroup</code>.
     * </p>
     */
    private String recordIdentifierValueAsString;
    /**
     * <p>
     * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
     * </p>
     */
    private java.util.List<String> featureNames;

    /**
     * <p>
     * The name of the feature group in which you want to put the records.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group in which you want to put the records.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group in which you want to put the records.
     * </p>
     * 
     * @return The name of the feature group in which you want to put the records.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group in which you want to put the records.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group in which you want to put the records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The value that corresponds to <code>RecordIdentifier</code> type and uniquely identifies the record in the
     * <code>FeatureGroup</code>.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value that corresponds to <code>RecordIdentifier</code> type and uniquely identifies the record in the
     *        <code>FeatureGroup</code>.
     */

    public void setRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        this.recordIdentifierValueAsString = recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value that corresponds to <code>RecordIdentifier</code> type and uniquely identifies the record in the
     * <code>FeatureGroup</code>.
     * </p>
     * 
     * @return The value that corresponds to <code>RecordIdentifier</code> type and uniquely identifies the record in
     *         the <code>FeatureGroup</code>.
     */

    public String getRecordIdentifierValueAsString() {
        return this.recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value that corresponds to <code>RecordIdentifier</code> type and uniquely identifies the record in the
     * <code>FeatureGroup</code>.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value that corresponds to <code>RecordIdentifier</code> type and uniquely identifies the record in the
     *        <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordRequest withRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        setRecordIdentifierValueAsString(recordIdentifierValueAsString);
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

    public GetRecordRequest withFeatureNames(String... featureNames) {
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

    public GetRecordRequest withFeatureNames(java.util.Collection<String> featureNames) {
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
        if (getRecordIdentifierValueAsString() != null)
            sb.append("RecordIdentifierValueAsString: ").append(getRecordIdentifierValueAsString()).append(",");
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

        if (obj instanceof GetRecordRequest == false)
            return false;
        GetRecordRequest other = (GetRecordRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getRecordIdentifierValueAsString() == null ^ this.getRecordIdentifierValueAsString() == null)
            return false;
        if (other.getRecordIdentifierValueAsString() != null
                && other.getRecordIdentifierValueAsString().equals(this.getRecordIdentifierValueAsString()) == false)
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
        hashCode = prime * hashCode + ((getRecordIdentifierValueAsString() == null) ? 0 : getRecordIdentifierValueAsString().hashCode());
        hashCode = prime * hashCode + ((getFeatureNames() == null) ? 0 : getFeatureNames().hashCode());
        return hashCode;
    }

    @Override
    public GetRecordRequest clone() {
        return (GetRecordRequest) super.clone();
    }

}
