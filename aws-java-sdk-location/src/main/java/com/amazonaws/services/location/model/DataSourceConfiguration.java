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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the data storage option chosen for requesting Places.
 * </p>
 * <note>
 * <p>
 * By using Places, you agree that AWS may transmit your API queries to your selected third party provider for
 * processing, which may be outside the AWS region you are currently using.
 * </p>
 * <p>
 * Also, when using HERE as your data provider, you may not (a) use HERE Places for Asset Management, or (b) select the
 * <code>Storage</code> option for the <code>IntendedUse</code> parameter when requesting Places in Japan. For more
 * information, see the <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location
 * Service.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DataSourceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     */
    private String intendedUse;

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * 
     * @param intendedUse
     *        Specifies how the results of an operation will be stored by the caller. </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SingleUse</code> specifies that the results won't be stored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Storage</code> specifies that the result can be cached or stored in a database.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value: <code>SingleUse</code>
     * @see IntendedUse
     */

    public void setIntendedUse(String intendedUse) {
        this.intendedUse = intendedUse;
    }

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * 
     * @return Specifies how the results of an operation will be stored by the caller. </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SingleUse</code> specifies that the results won't be stored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Storage</code> specifies that the result can be cached or stored in a database.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value: <code>SingleUse</code>
     * @see IntendedUse
     */

    public String getIntendedUse() {
        return this.intendedUse;
    }

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * 
     * @param intendedUse
     *        Specifies how the results of an operation will be stored by the caller. </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SingleUse</code> specifies that the results won't be stored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Storage</code> specifies that the result can be cached or stored in a database.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value: <code>SingleUse</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntendedUse
     */

    public DataSourceConfiguration withIntendedUse(String intendedUse) {
        setIntendedUse(intendedUse);
        return this;
    }

    /**
     * <p>
     * Specifies how the results of an operation will be stored by the caller.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SingleUse</code> specifies that the results won't be stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage</code> specifies that the result can be cached or stored in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value: <code>SingleUse</code>
     * </p>
     * 
     * @param intendedUse
     *        Specifies how the results of an operation will be stored by the caller. </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SingleUse</code> specifies that the results won't be stored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Storage</code> specifies that the result can be cached or stored in a database.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value: <code>SingleUse</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntendedUse
     */

    public DataSourceConfiguration withIntendedUse(IntendedUse intendedUse) {
        this.intendedUse = intendedUse.toString();
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
        if (getIntendedUse() != null)
            sb.append("IntendedUse: ").append(getIntendedUse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;
        if (other.getIntendedUse() == null ^ this.getIntendedUse() == null)
            return false;
        if (other.getIntendedUse() != null && other.getIntendedUse().equals(this.getIntendedUse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntendedUse() == null) ? 0 : getIntendedUse().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfiguration clone() {
        try {
            return (DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
