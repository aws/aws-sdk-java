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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides feature transformation information. Feature transformation is the process of modifying raw input data into a
 * form more suitable for model training.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/FeatureTransformation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureTransformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     */
    private String featureTransformationArn;
    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     */
    private java.util.Map<String, String> defaultParameters;
    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The last update date and time (in Unix time) of the feature transformation.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     * 
     * @param name
     *        The name of the feature transformation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     * 
     * @return The name of the feature transformation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     * 
     * @param name
     *        The name of the feature transformation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     * 
     * @param featureTransformationArn
     *        The Amazon Resource Name (ARN) of the FeatureTransformation object.
     */

    public void setFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the FeatureTransformation object.
     */

    public String getFeatureTransformationArn() {
        return this.featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     * 
     * @param featureTransformationArn
     *        The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation withFeatureTransformationArn(String featureTransformationArn) {
        setFeatureTransformationArn(featureTransformationArn);
        return this;
    }

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     * 
     * @return Provides the default parameters for feature transformation.
     */

    public java.util.Map<String, String> getDefaultParameters() {
        return defaultParameters;
    }

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     * 
     * @param defaultParameters
     *        Provides the default parameters for feature transformation.
     */

    public void setDefaultParameters(java.util.Map<String, String> defaultParameters) {
        this.defaultParameters = defaultParameters;
    }

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     * 
     * @param defaultParameters
     *        Provides the default parameters for feature transformation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation withDefaultParameters(java.util.Map<String, String> defaultParameters) {
        setDefaultParameters(defaultParameters);
        return this;
    }

    /**
     * Add a single DefaultParameters entry
     *
     * @see FeatureTransformation#withDefaultParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation addDefaultParametersEntry(String key, String value) {
        if (null == this.defaultParameters) {
            this.defaultParameters = new java.util.HashMap<String, String>();
        }
        if (this.defaultParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation clearDefaultParametersEntries() {
        this.defaultParameters = null;
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the feature transformation.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     * 
     * @return The creation date and time (in Unix time) of the feature transformation.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the feature transformation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the feature transformation.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last update date and time (in Unix time) of the feature transformation.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the feature transformation.
     * </p>
     * 
     * @return The last update date and time (in Unix time) of the feature transformation.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the feature transformation.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last update date and time (in Unix time) of the feature transformation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the feature transformation.</p>
     *        <p>
     *        A feature transformation can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the feature transformation.</p>
     *         <p>
     *         A feature transformation can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the feature transformation.</p>
     *        <p>
     *        A feature transformation can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureTransformation withStatus(String status) {
        setStatus(status);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFeatureTransformationArn() != null)
            sb.append("FeatureTransformationArn: ").append(getFeatureTransformationArn()).append(",");
        if (getDefaultParameters() != null)
            sb.append("DefaultParameters: ").append(getDefaultParameters()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeatureTransformation == false)
            return false;
        FeatureTransformation other = (FeatureTransformation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFeatureTransformationArn() == null ^ this.getFeatureTransformationArn() == null)
            return false;
        if (other.getFeatureTransformationArn() != null && other.getFeatureTransformationArn().equals(this.getFeatureTransformationArn()) == false)
            return false;
        if (other.getDefaultParameters() == null ^ this.getDefaultParameters() == null)
            return false;
        if (other.getDefaultParameters() != null && other.getDefaultParameters().equals(this.getDefaultParameters()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFeatureTransformationArn() == null) ? 0 : getFeatureTransformationArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultParameters() == null) ? 0 : getDefaultParameters().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public FeatureTransformation clone() {
        try {
            return (FeatureTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.FeatureTransformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
