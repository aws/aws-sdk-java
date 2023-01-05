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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ConfigureAccessPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureAccessPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     */
    private String accessPointArn;
    /**
     * <p>
     * A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the coordinates of
     * the network resource.
     * </p>
     */
    private String cpiSecretKey;
    /**
     * <p>
     * The CPI user ID of the CPI user who is certifying the coordinates of the network resource.
     * </p>
     */
    private String cpiUserId;
    /**
     * <p>
     * The CPI password associated with the CPI certificate in <code>cpiSecretKey</code>.
     * </p>
     */
    private String cpiUserPassword;
    /**
     * <p>
     * The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
     * </p>
     */
    private String cpiUsername;
    /**
     * <p>
     * The position of the network resource.
     * </p>
     */
    private Position position;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @param accessPointArn
     *        The Amazon Resource Name (ARN) of the network resource.
     */

    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network resource.
     */

    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @param accessPointArn
     *        The Amazon Resource Name (ARN) of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAccessPointRequest withAccessPointArn(String accessPointArn) {
        setAccessPointArn(accessPointArn);
        return this;
    }

    /**
     * <p>
     * A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the coordinates of
     * the network resource.
     * </p>
     * 
     * @param cpiSecretKey
     *        A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the
     *        coordinates of the network resource.
     */

    public void setCpiSecretKey(String cpiSecretKey) {
        this.cpiSecretKey = cpiSecretKey;
    }

    /**
     * <p>
     * A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the coordinates of
     * the network resource.
     * </p>
     * 
     * @return A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the
     *         coordinates of the network resource.
     */

    public String getCpiSecretKey() {
        return this.cpiSecretKey;
    }

    /**
     * <p>
     * A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the coordinates of
     * the network resource.
     * </p>
     * 
     * @param cpiSecretKey
     *        A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the
     *        coordinates of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAccessPointRequest withCpiSecretKey(String cpiSecretKey) {
        setCpiSecretKey(cpiSecretKey);
        return this;
    }

    /**
     * <p>
     * The CPI user ID of the CPI user who is certifying the coordinates of the network resource.
     * </p>
     * 
     * @param cpiUserId
     *        The CPI user ID of the CPI user who is certifying the coordinates of the network resource.
     */

    public void setCpiUserId(String cpiUserId) {
        this.cpiUserId = cpiUserId;
    }

    /**
     * <p>
     * The CPI user ID of the CPI user who is certifying the coordinates of the network resource.
     * </p>
     * 
     * @return The CPI user ID of the CPI user who is certifying the coordinates of the network resource.
     */

    public String getCpiUserId() {
        return this.cpiUserId;
    }

    /**
     * <p>
     * The CPI user ID of the CPI user who is certifying the coordinates of the network resource.
     * </p>
     * 
     * @param cpiUserId
     *        The CPI user ID of the CPI user who is certifying the coordinates of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAccessPointRequest withCpiUserId(String cpiUserId) {
        setCpiUserId(cpiUserId);
        return this;
    }

    /**
     * <p>
     * The CPI password associated with the CPI certificate in <code>cpiSecretKey</code>.
     * </p>
     * 
     * @param cpiUserPassword
     *        The CPI password associated with the CPI certificate in <code>cpiSecretKey</code>.
     */

    public void setCpiUserPassword(String cpiUserPassword) {
        this.cpiUserPassword = cpiUserPassword;
    }

    /**
     * <p>
     * The CPI password associated with the CPI certificate in <code>cpiSecretKey</code>.
     * </p>
     * 
     * @return The CPI password associated with the CPI certificate in <code>cpiSecretKey</code>.
     */

    public String getCpiUserPassword() {
        return this.cpiUserPassword;
    }

    /**
     * <p>
     * The CPI password associated with the CPI certificate in <code>cpiSecretKey</code>.
     * </p>
     * 
     * @param cpiUserPassword
     *        The CPI password associated with the CPI certificate in <code>cpiSecretKey</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAccessPointRequest withCpiUserPassword(String cpiUserPassword) {
        setCpiUserPassword(cpiUserPassword);
        return this;
    }

    /**
     * <p>
     * The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
     * </p>
     * 
     * @param cpiUsername
     *        The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
     */

    public void setCpiUsername(String cpiUsername) {
        this.cpiUsername = cpiUsername;
    }

    /**
     * <p>
     * The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
     * </p>
     * 
     * @return The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
     */

    public String getCpiUsername() {
        return this.cpiUsername;
    }

    /**
     * <p>
     * The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
     * </p>
     * 
     * @param cpiUsername
     *        The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAccessPointRequest withCpiUsername(String cpiUsername) {
        setCpiUsername(cpiUsername);
        return this;
    }

    /**
     * <p>
     * The position of the network resource.
     * </p>
     * 
     * @param position
     *        The position of the network resource.
     */

    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the network resource.
     * </p>
     * 
     * @return The position of the network resource.
     */

    public Position getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the network resource.
     * </p>
     * 
     * @param position
     *        The position of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAccessPointRequest withPosition(Position position) {
        setPosition(position);
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
        if (getAccessPointArn() != null)
            sb.append("AccessPointArn: ").append(getAccessPointArn()).append(",");
        if (getCpiSecretKey() != null)
            sb.append("CpiSecretKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getCpiUserId() != null)
            sb.append("CpiUserId: ").append("***Sensitive Data Redacted***").append(",");
        if (getCpiUserPassword() != null)
            sb.append("CpiUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getCpiUsername() != null)
            sb.append("CpiUsername: ").append("***Sensitive Data Redacted***").append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigureAccessPointRequest == false)
            return false;
        ConfigureAccessPointRequest other = (ConfigureAccessPointRequest) obj;
        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
            return false;
        if (other.getCpiSecretKey() == null ^ this.getCpiSecretKey() == null)
            return false;
        if (other.getCpiSecretKey() != null && other.getCpiSecretKey().equals(this.getCpiSecretKey()) == false)
            return false;
        if (other.getCpiUserId() == null ^ this.getCpiUserId() == null)
            return false;
        if (other.getCpiUserId() != null && other.getCpiUserId().equals(this.getCpiUserId()) == false)
            return false;
        if (other.getCpiUserPassword() == null ^ this.getCpiUserPassword() == null)
            return false;
        if (other.getCpiUserPassword() != null && other.getCpiUserPassword().equals(this.getCpiUserPassword()) == false)
            return false;
        if (other.getCpiUsername() == null ^ this.getCpiUsername() == null)
            return false;
        if (other.getCpiUsername() != null && other.getCpiUsername().equals(this.getCpiUsername()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        hashCode = prime * hashCode + ((getCpiSecretKey() == null) ? 0 : getCpiSecretKey().hashCode());
        hashCode = prime * hashCode + ((getCpiUserId() == null) ? 0 : getCpiUserId().hashCode());
        hashCode = prime * hashCode + ((getCpiUserPassword() == null) ? 0 : getCpiUserPassword().hashCode());
        hashCode = prime * hashCode + ((getCpiUsername() == null) ? 0 : getCpiUsername().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public ConfigureAccessPointRequest clone() {
        return (ConfigureAccessPointRequest) super.clone();
    }

}
