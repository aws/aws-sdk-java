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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the conflict resolution configuration for your data model configured in your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/BackendAPIConflictResolution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendAPIConflictResolution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The strategy for conflict resolution.
     * </p>
     */
    private String resolutionStrategy;

    /**
     * <p>
     * The strategy for conflict resolution.
     * </p>
     * 
     * @param resolutionStrategy
     *        The strategy for conflict resolution.
     * @see ResolutionStrategy
     */

    public void setResolutionStrategy(String resolutionStrategy) {
        this.resolutionStrategy = resolutionStrategy;
    }

    /**
     * <p>
     * The strategy for conflict resolution.
     * </p>
     * 
     * @return The strategy for conflict resolution.
     * @see ResolutionStrategy
     */

    public String getResolutionStrategy() {
        return this.resolutionStrategy;
    }

    /**
     * <p>
     * The strategy for conflict resolution.
     * </p>
     * 
     * @param resolutionStrategy
     *        The strategy for conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionStrategy
     */

    public BackendAPIConflictResolution withResolutionStrategy(String resolutionStrategy) {
        setResolutionStrategy(resolutionStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy for conflict resolution.
     * </p>
     * 
     * @param resolutionStrategy
     *        The strategy for conflict resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionStrategy
     */

    public BackendAPIConflictResolution withResolutionStrategy(ResolutionStrategy resolutionStrategy) {
        this.resolutionStrategy = resolutionStrategy.toString();
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
        if (getResolutionStrategy() != null)
            sb.append("ResolutionStrategy: ").append(getResolutionStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendAPIConflictResolution == false)
            return false;
        BackendAPIConflictResolution other = (BackendAPIConflictResolution) obj;
        if (other.getResolutionStrategy() == null ^ this.getResolutionStrategy() == null)
            return false;
        if (other.getResolutionStrategy() != null && other.getResolutionStrategy().equals(this.getResolutionStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolutionStrategy() == null) ? 0 : getResolutionStrategy().hashCode());
        return hashCode;
    }

    @Override
    public BackendAPIConflictResolution clone() {
        try {
            return (BackendAPIConflictResolution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.BackendAPIConflictResolutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
