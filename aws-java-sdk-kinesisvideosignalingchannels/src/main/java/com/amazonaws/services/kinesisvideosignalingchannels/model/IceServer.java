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
package com.amazonaws.services.kinesisvideosignalingchannels.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure for the ICE server connection data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/IceServer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IceServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of URIs, in the form specified in the <a
     * href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03">I-D.petithuguenin-behave-turn-uris</a>
     * spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
     * </p>
     */
    private java.util.List<String> uris;
    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     */
    private String username;
    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The period of time, in seconds, during which the username and password are valid.
     * </p>
     */
    private Integer ttl;

    /**
     * <p>
     * An array of URIs, in the form specified in the <a
     * href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03">I-D.petithuguenin-behave-turn-uris</a>
     * spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
     * </p>
     * 
     * @return An array of URIs, in the form specified in the <a
     *         href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *         >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the different addresses and/or protocols
     *         that can be used to reach the TURN server.
     */

    public java.util.List<String> getUris() {
        return uris;
    }

    /**
     * <p>
     * An array of URIs, in the form specified in the <a
     * href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03">I-D.petithuguenin-behave-turn-uris</a>
     * spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
     * </p>
     * 
     * @param uris
     *        An array of URIs, in the form specified in the <a
     *        href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *        >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the different addresses and/or protocols
     *        that can be used to reach the TURN server.
     */

    public void setUris(java.util.Collection<String> uris) {
        if (uris == null) {
            this.uris = null;
            return;
        }

        this.uris = new java.util.ArrayList<String>(uris);
    }

    /**
     * <p>
     * An array of URIs, in the form specified in the <a
     * href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03">I-D.petithuguenin-behave-turn-uris</a>
     * spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUris(java.util.Collection)} or {@link #withUris(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param uris
     *        An array of URIs, in the form specified in the <a
     *        href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *        >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the different addresses and/or protocols
     *        that can be used to reach the TURN server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IceServer withUris(String... uris) {
        if (this.uris == null) {
            setUris(new java.util.ArrayList<String>(uris.length));
        }
        for (String ele : uris) {
            this.uris.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of URIs, in the form specified in the <a
     * href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03">I-D.petithuguenin-behave-turn-uris</a>
     * spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
     * </p>
     * 
     * @param uris
     *        An array of URIs, in the form specified in the <a
     *        href="https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *        >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the different addresses and/or protocols
     *        that can be used to reach the TURN server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IceServer withUris(java.util.Collection<String> uris) {
        setUris(uris);
        return this;
    }

    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     * 
     * @param username
     *        A username to login to the ICE server.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     * 
     * @return A username to login to the ICE server.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     * 
     * @param username
     *        A username to login to the ICE server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IceServer withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     * 
     * @param password
     *        A password to login to the ICE server.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     * 
     * @return A password to login to the ICE server.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     * 
     * @param password
     *        A password to login to the ICE server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IceServer withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, during which the username and password are valid.
     * </p>
     * 
     * @param ttl
     *        The period of time, in seconds, during which the username and password are valid.
     */

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The period of time, in seconds, during which the username and password are valid.
     * </p>
     * 
     * @return The period of time, in seconds, during which the username and password are valid.
     */

    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * The period of time, in seconds, during which the username and password are valid.
     * </p>
     * 
     * @param ttl
     *        The period of time, in seconds, during which the username and password are valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IceServer withTtl(Integer ttl) {
        setTtl(ttl);
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
        if (getUris() != null)
            sb.append("Uris: ").append(getUris()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IceServer == false)
            return false;
        IceServer other = (IceServer) obj;
        if (other.getUris() == null ^ this.getUris() == null)
            return false;
        if (other.getUris() != null && other.getUris().equals(this.getUris()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUris() == null) ? 0 : getUris().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        return hashCode;
    }

    @Override
    public IceServer clone() {
        try {
            return (IceServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideosignalingchannels.model.transform.IceServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
