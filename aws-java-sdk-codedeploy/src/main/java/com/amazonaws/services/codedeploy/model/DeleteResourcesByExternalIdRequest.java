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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteResourcesByExternalId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourcesByExternalIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or more
     * CodeDeploy resources.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or more
     * CodeDeploy resources.
     * </p>
     * 
     * @param externalId
     *        The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or
     *        more CodeDeploy resources.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or more
     * CodeDeploy resources.
     * </p>
     * 
     * @return The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or
     *         more CodeDeploy resources.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or more
     * CodeDeploy resources.
     * </p>
     * 
     * @param externalId
     *        The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or
     *        more CodeDeploy resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcesByExternalIdRequest withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcesByExternalIdRequest == false)
            return false;
        DeleteResourcesByExternalIdRequest other = (DeleteResourcesByExternalIdRequest) obj;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourcesByExternalIdRequest clone() {
        return (DeleteResourcesByExternalIdRequest) super.clone();
    }

}
