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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDevicesForWirelessDeviceImportTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesForWirelessDeviceImportTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages received from devices in an
     * import task that are onboarded to AWS IoT Wireless.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * List of wireless devices in an import task and their onboarding status.
     * </p>
     */
    private java.util.List<ImportedWirelessDevice> importedWirelessDeviceList;

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @return The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesForWirelessDeviceImportTaskResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages received from devices in an
     * import task that are onboarded to AWS IoT Wireless.
     * </p>
     * 
     * @param destinationName
     *        The name of the Sidewalk destination that describes the IoT rule to route messages received from devices
     *        in an import task that are onboarded to AWS IoT Wireless.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages received from devices in an
     * import task that are onboarded to AWS IoT Wireless.
     * </p>
     * 
     * @return The name of the Sidewalk destination that describes the IoT rule to route messages received from devices
     *         in an import task that are onboarded to AWS IoT Wireless.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages received from devices in an
     * import task that are onboarded to AWS IoT Wireless.
     * </p>
     * 
     * @param destinationName
     *        The name of the Sidewalk destination that describes the IoT rule to route messages received from devices
     *        in an import task that are onboarded to AWS IoT Wireless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesForWirelessDeviceImportTaskResult withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * List of wireless devices in an import task and their onboarding status.
     * </p>
     * 
     * @return List of wireless devices in an import task and their onboarding status.
     */

    public java.util.List<ImportedWirelessDevice> getImportedWirelessDeviceList() {
        return importedWirelessDeviceList;
    }

    /**
     * <p>
     * List of wireless devices in an import task and their onboarding status.
     * </p>
     * 
     * @param importedWirelessDeviceList
     *        List of wireless devices in an import task and their onboarding status.
     */

    public void setImportedWirelessDeviceList(java.util.Collection<ImportedWirelessDevice> importedWirelessDeviceList) {
        if (importedWirelessDeviceList == null) {
            this.importedWirelessDeviceList = null;
            return;
        }

        this.importedWirelessDeviceList = new java.util.ArrayList<ImportedWirelessDevice>(importedWirelessDeviceList);
    }

    /**
     * <p>
     * List of wireless devices in an import task and their onboarding status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportedWirelessDeviceList(java.util.Collection)} or
     * {@link #withImportedWirelessDeviceList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param importedWirelessDeviceList
     *        List of wireless devices in an import task and their onboarding status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesForWirelessDeviceImportTaskResult withImportedWirelessDeviceList(ImportedWirelessDevice... importedWirelessDeviceList) {
        if (this.importedWirelessDeviceList == null) {
            setImportedWirelessDeviceList(new java.util.ArrayList<ImportedWirelessDevice>(importedWirelessDeviceList.length));
        }
        for (ImportedWirelessDevice ele : importedWirelessDeviceList) {
            this.importedWirelessDeviceList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of wireless devices in an import task and their onboarding status.
     * </p>
     * 
     * @param importedWirelessDeviceList
     *        List of wireless devices in an import task and their onboarding status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesForWirelessDeviceImportTaskResult withImportedWirelessDeviceList(java.util.Collection<ImportedWirelessDevice> importedWirelessDeviceList) {
        setImportedWirelessDeviceList(importedWirelessDeviceList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getImportedWirelessDeviceList() != null)
            sb.append("ImportedWirelessDeviceList: ").append(getImportedWirelessDeviceList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesForWirelessDeviceImportTaskResult == false)
            return false;
        ListDevicesForWirelessDeviceImportTaskResult other = (ListDevicesForWirelessDeviceImportTaskResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getImportedWirelessDeviceList() == null ^ this.getImportedWirelessDeviceList() == null)
            return false;
        if (other.getImportedWirelessDeviceList() != null && other.getImportedWirelessDeviceList().equals(this.getImportedWirelessDeviceList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getImportedWirelessDeviceList() == null) ? 0 : getImportedWirelessDeviceList().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesForWirelessDeviceImportTaskResult clone() {
        try {
            return (ListDevicesForWirelessDeviceImportTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
