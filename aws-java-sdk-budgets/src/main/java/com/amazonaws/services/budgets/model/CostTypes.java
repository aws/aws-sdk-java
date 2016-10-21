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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;

/**
 * This includes the options for getting the cost of a budget.
 */
public class CostTypes implements Serializable, Cloneable {

    private Boolean includeTax;

    private Boolean includeSubscription;

    private Boolean useBlended;

    /**
     * @param includeTax
     */

    public void setIncludeTax(Boolean includeTax) {
        this.includeTax = includeTax;
    }

    /**
     * @return
     */

    public Boolean getIncludeTax() {
        return this.includeTax;
    }

    /**
     * @param includeTax
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeTax(Boolean includeTax) {
        setIncludeTax(includeTax);
        return this;
    }

    /**
     * @return
     */

    public Boolean isIncludeTax() {
        return this.includeTax;
    }

    /**
     * @param includeSubscription
     */

    public void setIncludeSubscription(Boolean includeSubscription) {
        this.includeSubscription = includeSubscription;
    }

    /**
     * @return
     */

    public Boolean getIncludeSubscription() {
        return this.includeSubscription;
    }

    /**
     * @param includeSubscription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withIncludeSubscription(Boolean includeSubscription) {
        setIncludeSubscription(includeSubscription);
        return this;
    }

    /**
     * @return
     */

    public Boolean isIncludeSubscription() {
        return this.includeSubscription;
    }

    /**
     * @param useBlended
     */

    public void setUseBlended(Boolean useBlended) {
        this.useBlended = useBlended;
    }

    /**
     * @return
     */

    public Boolean getUseBlended() {
        return this.useBlended;
    }

    /**
     * @param useBlended
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostTypes withUseBlended(Boolean useBlended) {
        setUseBlended(useBlended);
        return this;
    }

    /**
     * @return
     */

    public Boolean isUseBlended() {
        return this.useBlended;
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
        if (getIncludeTax() != null)
            sb.append("IncludeTax: " + getIncludeTax() + ",");
        if (getIncludeSubscription() != null)
            sb.append("IncludeSubscription: " + getIncludeSubscription() + ",");
        if (getUseBlended() != null)
            sb.append("UseBlended: " + getUseBlended());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostTypes == false)
            return false;
        CostTypes other = (CostTypes) obj;
        if (other.getIncludeTax() == null ^ this.getIncludeTax() == null)
            return false;
        if (other.getIncludeTax() != null && other.getIncludeTax().equals(this.getIncludeTax()) == false)
            return false;
        if (other.getIncludeSubscription() == null ^ this.getIncludeSubscription() == null)
            return false;
        if (other.getIncludeSubscription() != null && other.getIncludeSubscription().equals(this.getIncludeSubscription()) == false)
            return false;
        if (other.getUseBlended() == null ^ this.getUseBlended() == null)
            return false;
        if (other.getUseBlended() != null && other.getUseBlended().equals(this.getUseBlended()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeTax() == null) ? 0 : getIncludeTax().hashCode());
        hashCode = prime * hashCode + ((getIncludeSubscription() == null) ? 0 : getIncludeSubscription().hashCode());
        hashCode = prime * hashCode + ((getUseBlended() == null) ? 0 : getUseBlended().hashCode());
        return hashCode;
    }

    @Override
    public CostTypes clone() {
        try {
            return (CostTypes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
