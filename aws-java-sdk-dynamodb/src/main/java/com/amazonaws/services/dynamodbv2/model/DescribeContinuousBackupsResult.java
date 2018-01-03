/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeContinuousBackups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContinuousBackupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * <code>ContinuousBackupsDescription</code> can be one of the following : ENABLED, DISABLED.
     * </p>
     */
    private ContinuousBackupsDescription continuousBackupsDescription;

    /**
     * <p>
     * <code>ContinuousBackupsDescription</code> can be one of the following : ENABLED, DISABLED.
     * </p>
     * 
     * @param continuousBackupsDescription
     *        <code>ContinuousBackupsDescription</code> can be one of the following : ENABLED, DISABLED.
     */

    public void setContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
    }

    /**
     * <p>
     * <code>ContinuousBackupsDescription</code> can be one of the following : ENABLED, DISABLED.
     * </p>
     * 
     * @return <code>ContinuousBackupsDescription</code> can be one of the following : ENABLED, DISABLED.
     */

    public ContinuousBackupsDescription getContinuousBackupsDescription() {
        return this.continuousBackupsDescription;
    }

    /**
     * <p>
     * <code>ContinuousBackupsDescription</code> can be one of the following : ENABLED, DISABLED.
     * </p>
     * 
     * @param continuousBackupsDescription
     *        <code>ContinuousBackupsDescription</code> can be one of the following : ENABLED, DISABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousBackupsResult withContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        setContinuousBackupsDescription(continuousBackupsDescription);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContinuousBackupsDescription() != null)
            sb.append("ContinuousBackupsDescription: ").append(getContinuousBackupsDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContinuousBackupsResult == false)
            return false;
        DescribeContinuousBackupsResult other = (DescribeContinuousBackupsResult) obj;
        if (other.getContinuousBackupsDescription() == null ^ this.getContinuousBackupsDescription() == null)
            return false;
        if (other.getContinuousBackupsDescription() != null && other.getContinuousBackupsDescription().equals(this.getContinuousBackupsDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContinuousBackupsDescription() == null) ? 0 : getContinuousBackupsDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContinuousBackupsResult clone() {
        try {
            return (DescribeContinuousBackupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
