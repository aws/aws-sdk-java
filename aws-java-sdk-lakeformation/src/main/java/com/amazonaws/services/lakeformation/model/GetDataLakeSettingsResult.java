/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataLakeSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of AWS Lake Formation principals.
     * </p>
     */
    private DataLakeSettings dataLakeSettings;

    /**
     * <p>
     * A list of AWS Lake Formation principals.
     * </p>
     * 
     * @param dataLakeSettings
     *        A list of AWS Lake Formation principals.
     */

    public void setDataLakeSettings(DataLakeSettings dataLakeSettings) {
        this.dataLakeSettings = dataLakeSettings;
    }

    /**
     * <p>
     * A list of AWS Lake Formation principals.
     * </p>
     * 
     * @return A list of AWS Lake Formation principals.
     */

    public DataLakeSettings getDataLakeSettings() {
        return this.dataLakeSettings;
    }

    /**
     * <p>
     * A list of AWS Lake Formation principals.
     * </p>
     * 
     * @param dataLakeSettings
     *        A list of AWS Lake Formation principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSettingsResult withDataLakeSettings(DataLakeSettings dataLakeSettings) {
        setDataLakeSettings(dataLakeSettings);
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
        if (getDataLakeSettings() != null)
            sb.append("DataLakeSettings: ").append(getDataLakeSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataLakeSettingsResult == false)
            return false;
        GetDataLakeSettingsResult other = (GetDataLakeSettingsResult) obj;
        if (other.getDataLakeSettings() == null ^ this.getDataLakeSettings() == null)
            return false;
        if (other.getDataLakeSettings() != null && other.getDataLakeSettings().equals(this.getDataLakeSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLakeSettings() == null) ? 0 : getDataLakeSettings().hashCode());
        return hashCode;
    }

    @Override
    public GetDataLakeSettingsResult clone() {
        try {
            return (GetDataLakeSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
