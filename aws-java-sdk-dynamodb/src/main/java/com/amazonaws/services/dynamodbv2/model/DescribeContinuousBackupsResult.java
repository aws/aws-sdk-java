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
     * Represents the continuous backups and point in time recovery settings on the table.
     * </p>
     */
    private ContinuousBackupsDescription continuousBackupsDescription;

    /**
     * <p>
     * Represents the continuous backups and point in time recovery settings on the table.
     * </p>
     * 
     * @param continuousBackupsDescription
     *        Represents the continuous backups and point in time recovery settings on the table.
     */

    public void setContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
    }

    /**
     * <p>
     * Represents the continuous backups and point in time recovery settings on the table.
     * </p>
     * 
     * @return Represents the continuous backups and point in time recovery settings on the table.
     */

    public ContinuousBackupsDescription getContinuousBackupsDescription() {
        return this.continuousBackupsDescription;
    }

    /**
     * <p>
     * Represents the continuous backups and point in time recovery settings on the table.
     * </p>
     * 
     * @param continuousBackupsDescription
     *        Represents the continuous backups and point in time recovery settings on the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousBackupsResult withContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        setContinuousBackupsDescription(continuousBackupsDescription);
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
