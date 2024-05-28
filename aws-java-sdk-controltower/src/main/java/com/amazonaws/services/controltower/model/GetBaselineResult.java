/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBaselineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The baseline ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A description of the baseline.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A user-friendly name for the baseline.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The baseline ARN.
     * </p>
     * 
     * @param arn
     *        The baseline ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The baseline ARN.
     * </p>
     * 
     * @return The baseline ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The baseline ARN.
     * </p>
     * 
     * @param arn
     *        The baseline ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBaselineResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A description of the baseline.
     * </p>
     * 
     * @param description
     *        A description of the baseline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the baseline.
     * </p>
     * 
     * @return A description of the baseline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the baseline.
     * </p>
     * 
     * @param description
     *        A description of the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBaselineResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the baseline.
     * </p>
     * 
     * @param name
     *        A user-friendly name for the baseline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-friendly name for the baseline.
     * </p>
     * 
     * @return A user-friendly name for the baseline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-friendly name for the baseline.
     * </p>
     * 
     * @param name
     *        A user-friendly name for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBaselineResult withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBaselineResult == false)
            return false;
        GetBaselineResult other = (GetBaselineResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetBaselineResult clone() {
        try {
            return (GetBaselineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
