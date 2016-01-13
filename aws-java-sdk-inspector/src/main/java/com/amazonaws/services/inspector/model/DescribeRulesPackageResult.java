/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeRulesPackageResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the rules package.
     * </p>
     */
    private RulesPackage rulesPackage;

    /**
     * <p>
     * Information about the rules package.
     * </p>
     * 
     * @param rulesPackage
     *        Information about the rules package.
     */
    public void setRulesPackage(RulesPackage rulesPackage) {
        this.rulesPackage = rulesPackage;
    }

    /**
     * <p>
     * Information about the rules package.
     * </p>
     * 
     * @return Information about the rules package.
     */
    public RulesPackage getRulesPackage() {
        return this.rulesPackage;
    }

    /**
     * <p>
     * Information about the rules package.
     * </p>
     * 
     * @param rulesPackage
     *        Information about the rules package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeRulesPackageResult withRulesPackage(RulesPackage rulesPackage) {
        setRulesPackage(rulesPackage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRulesPackage() != null)
            sb.append("RulesPackage: " + getRulesPackage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRulesPackageResult == false)
            return false;
        DescribeRulesPackageResult other = (DescribeRulesPackageResult) obj;
        if (other.getRulesPackage() == null ^ this.getRulesPackage() == null)
            return false;
        if (other.getRulesPackage() != null
                && other.getRulesPackage().equals(this.getRulesPackage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRulesPackage() == null) ? 0 : getRulesPackage()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeRulesPackageResult clone() {
        try {
            return (DescribeRulesPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}