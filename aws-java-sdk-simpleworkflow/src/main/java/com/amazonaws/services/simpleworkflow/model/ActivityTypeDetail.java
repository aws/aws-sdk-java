/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed information about an activity type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ActivityTypeDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityTypeDetail extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * General information about the activity type.
     * </p>
     * <p>
     * The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateActivityType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new tasks of this type.
     * </p>
     * </li>
     * </ul>
     */
    private ActivityTypeInfo typeInfo;
    /**
     * <p>
     * The configuration settings registered with the activity type.
     * </p>
     */
    private ActivityTypeConfiguration configuration;

    /**
     * <p>
     * General information about the activity type.
     * </p>
     * <p>
     * The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateActivityType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new tasks of this type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeInfo
     *        General information about the activity type.</p>
     *        <p>
     *        The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be
     *        running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateActivityType</a>, but is still in use.
     *        You should keep workers supporting this type running. You cannot create new tasks of this type.
     *        </p>
     *        </li>
     */

    public void setTypeInfo(ActivityTypeInfo typeInfo) {
        this.typeInfo = typeInfo;
    }

    /**
     * <p>
     * General information about the activity type.
     * </p>
     * <p>
     * The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateActivityType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new tasks of this type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return General information about the activity type.</p>
     *         <p>
     *         The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be
     *         running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateActivityType</a>, but is still in
     *         use. You should keep workers supporting this type running. You cannot create new tasks of this type.
     *         </p>
     *         </li>
     */

    public ActivityTypeInfo getTypeInfo() {
        return this.typeInfo;
    }

    /**
     * <p>
     * General information about the activity type.
     * </p>
     * <p>
     * The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateActivityType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new tasks of this type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeInfo
     *        General information about the activity type.</p>
     *        <p>
     *        The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be
     *        running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateActivityType</a>, but is still in use.
     *        You should keep workers supporting this type running. You cannot create new tasks of this type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeDetail withTypeInfo(ActivityTypeInfo typeInfo) {
        setTypeInfo(typeInfo);
        return this;
    }

    /**
     * <p>
     * The configuration settings registered with the activity type.
     * </p>
     * 
     * @param configuration
     *        The configuration settings registered with the activity type.
     */

    public void setConfiguration(ActivityTypeConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration settings registered with the activity type.
     * </p>
     * 
     * @return The configuration settings registered with the activity type.
     */

    public ActivityTypeConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration settings registered with the activity type.
     * </p>
     * 
     * @param configuration
     *        The configuration settings registered with the activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeDetail withConfiguration(ActivityTypeConfiguration configuration) {
        setConfiguration(configuration);
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
        if (getTypeInfo() != null)
            sb.append("TypeInfo: ").append(getTypeInfo()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityTypeDetail == false)
            return false;
        ActivityTypeDetail other = (ActivityTypeDetail) obj;
        if (other.getTypeInfo() == null ^ this.getTypeInfo() == null)
            return false;
        if (other.getTypeInfo() != null && other.getTypeInfo().equals(this.getTypeInfo()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeInfo() == null) ? 0 : getTypeInfo().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ActivityTypeDetail clone() {
        try {
            return (ActivityTypeDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
