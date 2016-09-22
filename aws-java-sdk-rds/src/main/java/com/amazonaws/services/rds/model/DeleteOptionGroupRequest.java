/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DeleteOptionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option group to be deleted.
     * </p>
     * <note>
     * <p>
     * You cannot delete default option groups.
     * </p>
     * </note>
     */
    private String optionGroupName;

    /**
     * <p>
     * The name of the option group to be deleted.
     * </p>
     * <note>
     * <p>
     * You cannot delete default option groups.
     * </p>
     * </note>
     * 
     * @param optionGroupName
     *        The name of the option group to be deleted.</p> <note>
     *        <p>
     *        You cannot delete default option groups.
     *        </p>
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be deleted.
     * </p>
     * <note>
     * <p>
     * You cannot delete default option groups.
     * </p>
     * </note>
     * 
     * @return The name of the option group to be deleted.</p> <note>
     *         <p>
     *         You cannot delete default option groups.
     *         </p>
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be deleted.
     * </p>
     * <note>
     * <p>
     * You cannot delete default option groups.
     * </p>
     * </note>
     * 
     * @param optionGroupName
     *        The name of the option group to be deleted.</p> <note>
     *        <p>
     *        You cannot delete default option groups.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOptionGroupRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOptionGroupRequest == false)
            return false;
        DeleteOptionGroupRequest other = (DeleteOptionGroupRequest) obj;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteOptionGroupRequest clone() {
        return (DeleteOptionGroupRequest) super.clone();
    }
}
