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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateAppBlockBuilderAppBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAppBlockBuilderAppBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of app block builders associated with app blocks.
     * </p>
     */
    private AppBlockBuilderAppBlockAssociation appBlockBuilderAppBlockAssociation;

    /**
     * <p>
     * The list of app block builders associated with app blocks.
     * </p>
     * 
     * @param appBlockBuilderAppBlockAssociation
     *        The list of app block builders associated with app blocks.
     */

    public void setAppBlockBuilderAppBlockAssociation(AppBlockBuilderAppBlockAssociation appBlockBuilderAppBlockAssociation) {
        this.appBlockBuilderAppBlockAssociation = appBlockBuilderAppBlockAssociation;
    }

    /**
     * <p>
     * The list of app block builders associated with app blocks.
     * </p>
     * 
     * @return The list of app block builders associated with app blocks.
     */

    public AppBlockBuilderAppBlockAssociation getAppBlockBuilderAppBlockAssociation() {
        return this.appBlockBuilderAppBlockAssociation;
    }

    /**
     * <p>
     * The list of app block builders associated with app blocks.
     * </p>
     * 
     * @param appBlockBuilderAppBlockAssociation
     *        The list of app block builders associated with app blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAppBlockBuilderAppBlockResult withAppBlockBuilderAppBlockAssociation(AppBlockBuilderAppBlockAssociation appBlockBuilderAppBlockAssociation) {
        setAppBlockBuilderAppBlockAssociation(appBlockBuilderAppBlockAssociation);
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
        if (getAppBlockBuilderAppBlockAssociation() != null)
            sb.append("AppBlockBuilderAppBlockAssociation: ").append(getAppBlockBuilderAppBlockAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAppBlockBuilderAppBlockResult == false)
            return false;
        AssociateAppBlockBuilderAppBlockResult other = (AssociateAppBlockBuilderAppBlockResult) obj;
        if (other.getAppBlockBuilderAppBlockAssociation() == null ^ this.getAppBlockBuilderAppBlockAssociation() == null)
            return false;
        if (other.getAppBlockBuilderAppBlockAssociation() != null
                && other.getAppBlockBuilderAppBlockAssociation().equals(this.getAppBlockBuilderAppBlockAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBlockBuilderAppBlockAssociation() == null) ? 0 : getAppBlockBuilderAppBlockAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAppBlockBuilderAppBlockResult clone() {
        try {
            return (AssociateAppBlockBuilderAppBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
