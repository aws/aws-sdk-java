/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error in the analysis of the application unit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AppUnitError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppUnitError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category of the error.
     * </p>
     */
    private String appUnitErrorCategory;

    /**
     * <p>
     * The category of the error.
     * </p>
     * 
     * @param appUnitErrorCategory
     *        The category of the error.
     * @see AppUnitErrorCategory
     */

    public void setAppUnitErrorCategory(String appUnitErrorCategory) {
        this.appUnitErrorCategory = appUnitErrorCategory;
    }

    /**
     * <p>
     * The category of the error.
     * </p>
     * 
     * @return The category of the error.
     * @see AppUnitErrorCategory
     */

    public String getAppUnitErrorCategory() {
        return this.appUnitErrorCategory;
    }

    /**
     * <p>
     * The category of the error.
     * </p>
     * 
     * @param appUnitErrorCategory
     *        The category of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppUnitErrorCategory
     */

    public AppUnitError withAppUnitErrorCategory(String appUnitErrorCategory) {
        setAppUnitErrorCategory(appUnitErrorCategory);
        return this;
    }

    /**
     * <p>
     * The category of the error.
     * </p>
     * 
     * @param appUnitErrorCategory
     *        The category of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppUnitErrorCategory
     */

    public AppUnitError withAppUnitErrorCategory(AppUnitErrorCategory appUnitErrorCategory) {
        this.appUnitErrorCategory = appUnitErrorCategory.toString();
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
        if (getAppUnitErrorCategory() != null)
            sb.append("AppUnitErrorCategory: ").append(getAppUnitErrorCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppUnitError == false)
            return false;
        AppUnitError other = (AppUnitError) obj;
        if (other.getAppUnitErrorCategory() == null ^ this.getAppUnitErrorCategory() == null)
            return false;
        if (other.getAppUnitErrorCategory() != null && other.getAppUnitErrorCategory().equals(this.getAppUnitErrorCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppUnitErrorCategory() == null) ? 0 : getAppUnitErrorCategory().hashCode());
        return hashCode;
    }

    @Override
    public AppUnitError clone() {
        try {
            return (AppUnitError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AppUnitErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
