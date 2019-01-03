/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * This data type represents the information you need to connect to an Amazon Aurora DB cluster. This data type is used
 * as a response element in the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateDBClusterEndpoint</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeDBClusterEndpoints</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ModifyDBClusterEndpoint</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteDBClusterEndpoint</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For the data structure that represents Amazon RDS DB instance endpoints, see <a>Endpoint</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBClusterEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBClusterEndpointIdentifier;
    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
     * </p>
     */
    private String dBClusterEndpointResourceIdentifier;
    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>, <code>available</code>, <code>deleting</code>,
     * <code>modifying</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>, <code>ANY</code>.
     * </p>
     */
    private String customEndpointType;
    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> staticMembers;
    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> excludedMembers;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     */
    private String dBClusterEndpointArn;

    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBClusterEndpointIdentifier
     *        The identifier associated with the endpoint. This parameter is stored as a lowercase string.
     */

    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The identifier associated with the endpoint. This parameter is stored as a lowercase string.
     */

    public String getDBClusterEndpointIdentifier() {
        return this.dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBClusterEndpointIdentifier
     *        The identifier associated with the endpoint. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        setDBClusterEndpointIdentifier(dBClusterEndpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *        lowercase string.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @return The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *         lowercase string.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *        lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
     * </p>
     * 
     * @param dBClusterEndpointResourceIdentifier
     *        A unique system-generated identifier for an endpoint. It remains the same for the whole life of the
     *        endpoint.
     */

    public void setDBClusterEndpointResourceIdentifier(String dBClusterEndpointResourceIdentifier) {
        this.dBClusterEndpointResourceIdentifier = dBClusterEndpointResourceIdentifier;
    }

    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
     * </p>
     * 
     * @return A unique system-generated identifier for an endpoint. It remains the same for the whole life of the
     *         endpoint.
     */

    public String getDBClusterEndpointResourceIdentifier() {
        return this.dBClusterEndpointResourceIdentifier;
    }

    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
     * </p>
     * 
     * @param dBClusterEndpointResourceIdentifier
     *        A unique system-generated identifier for an endpoint. It remains the same for the whole life of the
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withDBClusterEndpointResourceIdentifier(String dBClusterEndpointResourceIdentifier) {
        setDBClusterEndpointResourceIdentifier(dBClusterEndpointResourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     * 
     * @param endpoint
     *        The DNS address of the endpoint.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     * 
     * @return The DNS address of the endpoint.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     * 
     * @param endpoint
     *        The DNS address of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>, <code>available</code>, <code>deleting</code>,
     * <code>modifying</code>.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint. One of: <code>creating</code>, <code>available</code>,
     *        <code>deleting</code>, <code>modifying</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>, <code>available</code>, <code>deleting</code>,
     * <code>modifying</code>.
     * </p>
     * 
     * @return The current status of the endpoint. One of: <code>creating</code>, <code>available</code>,
     *         <code>deleting</code>, <code>modifying</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>, <code>available</code>, <code>deleting</code>,
     * <code>modifying</code>.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint. One of: <code>creating</code>, <code>available</code>,
     *        <code>deleting</code>, <code>modifying</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>CUSTOM</code>.
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     * 
     * @return The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>CUSTOM</code>.
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>, <code>ANY</code>.
     * </p>
     * 
     * @param customEndpointType
     *        The type associated with a custom endpoint. One of: <code>READER</code>, <code>ANY</code>.
     */

    public void setCustomEndpointType(String customEndpointType) {
        this.customEndpointType = customEndpointType;
    }

    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>, <code>ANY</code>.
     * </p>
     * 
     * @return The type associated with a custom endpoint. One of: <code>READER</code>, <code>ANY</code>.
     */

    public String getCustomEndpointType() {
        return this.customEndpointType;
    }

    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>, <code>ANY</code>.
     * </p>
     * 
     * @param customEndpointType
     *        The type associated with a custom endpoint. One of: <code>READER</code>, <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withCustomEndpointType(String customEndpointType) {
        setCustomEndpointType(customEndpointType);
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * 
     * @return List of DB instance identifiers that are part of the custom endpoint group.
     */

    public java.util.List<String> getStaticMembers() {
        if (staticMembers == null) {
            staticMembers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return staticMembers;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * 
     * @param staticMembers
     *        List of DB instance identifiers that are part of the custom endpoint group.
     */

    public void setStaticMembers(java.util.Collection<String> staticMembers) {
        if (staticMembers == null) {
            this.staticMembers = null;
            return;
        }

        this.staticMembers = new com.amazonaws.internal.SdkInternalList<String>(staticMembers);
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaticMembers(java.util.Collection)} or {@link #withStaticMembers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param staticMembers
     *        List of DB instance identifiers that are part of the custom endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withStaticMembers(String... staticMembers) {
        if (this.staticMembers == null) {
            setStaticMembers(new com.amazonaws.internal.SdkInternalList<String>(staticMembers.length));
        }
        for (String ele : staticMembers) {
            this.staticMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * 
     * @param staticMembers
     *        List of DB instance identifiers that are part of the custom endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withStaticMembers(java.util.Collection<String> staticMembers) {
        setStaticMembers(staticMembers);
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * 
     * @return List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *         instances are reachable through the custom endpoint. Only relevant if the list of static members is
     *         empty.
     */

    public java.util.List<String> getExcludedMembers() {
        if (excludedMembers == null) {
            excludedMembers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludedMembers;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * 
     * @param excludedMembers
     *        List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *        instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     */

    public void setExcludedMembers(java.util.Collection<String> excludedMembers) {
        if (excludedMembers == null) {
            this.excludedMembers = null;
            return;
        }

        this.excludedMembers = new com.amazonaws.internal.SdkInternalList<String>(excludedMembers);
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedMembers(java.util.Collection)} or {@link #withExcludedMembers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludedMembers
     *        List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *        instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withExcludedMembers(String... excludedMembers) {
        if (this.excludedMembers == null) {
            setExcludedMembers(new com.amazonaws.internal.SdkInternalList<String>(excludedMembers.length));
        }
        for (String ele : excludedMembers) {
            this.excludedMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * 
     * @param excludedMembers
     *        List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *        instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withExcludedMembers(java.util.Collection<String> excludedMembers) {
        setExcludedMembers(excludedMembers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     * 
     * @param dBClusterEndpointArn
     *        The Amazon Resource Name (ARN) for the endpoint.
     */

    public void setDBClusterEndpointArn(String dBClusterEndpointArn) {
        this.dBClusterEndpointArn = dBClusterEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the endpoint.
     */

    public String getDBClusterEndpointArn() {
        return this.dBClusterEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     * 
     * @param dBClusterEndpointArn
     *        The Amazon Resource Name (ARN) for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterEndpoint withDBClusterEndpointArn(String dBClusterEndpointArn) {
        setDBClusterEndpointArn(dBClusterEndpointArn);
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
        if (getDBClusterEndpointIdentifier() != null)
            sb.append("DBClusterEndpointIdentifier: ").append(getDBClusterEndpointIdentifier()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBClusterEndpointResourceIdentifier() != null)
            sb.append("DBClusterEndpointResourceIdentifier: ").append(getDBClusterEndpointResourceIdentifier()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getCustomEndpointType() != null)
            sb.append("CustomEndpointType: ").append(getCustomEndpointType()).append(",");
        if (getStaticMembers() != null)
            sb.append("StaticMembers: ").append(getStaticMembers()).append(",");
        if (getExcludedMembers() != null)
            sb.append("ExcludedMembers: ").append(getExcludedMembers()).append(",");
        if (getDBClusterEndpointArn() != null)
            sb.append("DBClusterEndpointArn: ").append(getDBClusterEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterEndpoint == false)
            return false;
        DBClusterEndpoint other = (DBClusterEndpoint) obj;
        if (other.getDBClusterEndpointIdentifier() == null ^ this.getDBClusterEndpointIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointIdentifier() != null && other.getDBClusterEndpointIdentifier().equals(this.getDBClusterEndpointIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterEndpointResourceIdentifier() == null ^ this.getDBClusterEndpointResourceIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointResourceIdentifier() != null
                && other.getDBClusterEndpointResourceIdentifier().equals(this.getDBClusterEndpointResourceIdentifier()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getCustomEndpointType() == null ^ this.getCustomEndpointType() == null)
            return false;
        if (other.getCustomEndpointType() != null && other.getCustomEndpointType().equals(this.getCustomEndpointType()) == false)
            return false;
        if (other.getStaticMembers() == null ^ this.getStaticMembers() == null)
            return false;
        if (other.getStaticMembers() != null && other.getStaticMembers().equals(this.getStaticMembers()) == false)
            return false;
        if (other.getExcludedMembers() == null ^ this.getExcludedMembers() == null)
            return false;
        if (other.getExcludedMembers() != null && other.getExcludedMembers().equals(this.getExcludedMembers()) == false)
            return false;
        if (other.getDBClusterEndpointArn() == null ^ this.getDBClusterEndpointArn() == null)
            return false;
        if (other.getDBClusterEndpointArn() != null && other.getDBClusterEndpointArn().equals(this.getDBClusterEndpointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterEndpointIdentifier() == null) ? 0 : getDBClusterEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterEndpointResourceIdentifier() == null) ? 0 : getDBClusterEndpointResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpointType() == null) ? 0 : getCustomEndpointType().hashCode());
        hashCode = prime * hashCode + ((getStaticMembers() == null) ? 0 : getStaticMembers().hashCode());
        hashCode = prime * hashCode + ((getExcludedMembers() == null) ? 0 : getExcludedMembers().hashCode());
        hashCode = prime * hashCode + ((getDBClusterEndpointArn() == null) ? 0 : getDBClusterEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterEndpoint clone() {
        try {
            return (DBClusterEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
