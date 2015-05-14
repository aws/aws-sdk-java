/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a Remote Authentication Dial In User
 * Service (RADIUS) server.
 * </p>
 */
public class RadiusSettings implements Serializable, Cloneable {

    /**
     * An array of strings that contains the IP addresses of the RADIUS
     * server endpoints, or the IP addresses of your RADIUS server load
     * balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> radiusServers;

    /**
     * The port that your RADIUS server is using for communications. Your
     * on-premises network must allow inbound traffic over this port from the
     * AWS Directory Service servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1025 - 65535<br/>
     */
    private Integer radiusPort;

    /**
     * The amount of time, in seconds, to wait for the RADIUS server to
     * respond.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer radiusTimeout;

    /**
     * The maximum number of times that communication with the RADIUS server
     * is attempted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     */
    private Integer radiusRetries;

    /**
     * The shared secret code that was specified when your RADIUS endpoints
     * were created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     */
    private String sharedSecret;

    /**
     * The protocol specified for your RADIUS endpoints.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAP, CHAP, MS-CHAPv1, MS-CHAPv2
     */
    private String authenticationProtocol;

    /**
     * Not currently used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String displayLabel;

    /**
     * Not currently used.
     */
    private Boolean useSameUsername;

    /**
     * An array of strings that contains the IP addresses of the RADIUS
     * server endpoints, or the IP addresses of your RADIUS server load
     * balancer.
     *
     * @return An array of strings that contains the IP addresses of the RADIUS
     *         server endpoints, or the IP addresses of your RADIUS server load
     *         balancer.
     */
    public java.util.List<String> getRadiusServers() {
        if (radiusServers == null) {
              radiusServers = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              radiusServers.setAutoConstruct(true);
        }
        return radiusServers;
    }
    
    /**
     * An array of strings that contains the IP addresses of the RADIUS
     * server endpoints, or the IP addresses of your RADIUS server load
     * balancer.
     *
     * @param radiusServers An array of strings that contains the IP addresses of the RADIUS
     *         server endpoints, or the IP addresses of your RADIUS server load
     *         balancer.
     */
    public void setRadiusServers(java.util.Collection<String> radiusServers) {
        if (radiusServers == null) {
            this.radiusServers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> radiusServersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(radiusServers.size());
        radiusServersCopy.addAll(radiusServers);
        this.radiusServers = radiusServersCopy;
    }
    
    /**
     * An array of strings that contains the IP addresses of the RADIUS
     * server endpoints, or the IP addresses of your RADIUS server load
     * balancer.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRadiusServers(java.util.Collection)} or {@link
     * #withRadiusServers(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param radiusServers An array of strings that contains the IP addresses of the RADIUS
     *         server endpoints, or the IP addresses of your RADIUS server load
     *         balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withRadiusServers(String... radiusServers) {
        if (getRadiusServers() == null) setRadiusServers(new java.util.ArrayList<String>(radiusServers.length));
        for (String value : radiusServers) {
            getRadiusServers().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings that contains the IP addresses of the RADIUS
     * server endpoints, or the IP addresses of your RADIUS server load
     * balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param radiusServers An array of strings that contains the IP addresses of the RADIUS
     *         server endpoints, or the IP addresses of your RADIUS server load
     *         balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withRadiusServers(java.util.Collection<String> radiusServers) {
        if (radiusServers == null) {
            this.radiusServers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> radiusServersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(radiusServers.size());
            radiusServersCopy.addAll(radiusServers);
            this.radiusServers = radiusServersCopy;
        }

        return this;
    }

    /**
     * The port that your RADIUS server is using for communications. Your
     * on-premises network must allow inbound traffic over this port from the
     * AWS Directory Service servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1025 - 65535<br/>
     *
     * @return The port that your RADIUS server is using for communications. Your
     *         on-premises network must allow inbound traffic over this port from the
     *         AWS Directory Service servers.
     */
    public Integer getRadiusPort() {
        return radiusPort;
    }
    
    /**
     * The port that your RADIUS server is using for communications. Your
     * on-premises network must allow inbound traffic over this port from the
     * AWS Directory Service servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1025 - 65535<br/>
     *
     * @param radiusPort The port that your RADIUS server is using for communications. Your
     *         on-premises network must allow inbound traffic over this port from the
     *         AWS Directory Service servers.
     */
    public void setRadiusPort(Integer radiusPort) {
        this.radiusPort = radiusPort;
    }
    
    /**
     * The port that your RADIUS server is using for communications. Your
     * on-premises network must allow inbound traffic over this port from the
     * AWS Directory Service servers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1025 - 65535<br/>
     *
     * @param radiusPort The port that your RADIUS server is using for communications. Your
     *         on-premises network must allow inbound traffic over this port from the
     *         AWS Directory Service servers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withRadiusPort(Integer radiusPort) {
        this.radiusPort = radiusPort;
        return this;
    }

    /**
     * The amount of time, in seconds, to wait for the RADIUS server to
     * respond.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return The amount of time, in seconds, to wait for the RADIUS server to
     *         respond.
     */
    public Integer getRadiusTimeout() {
        return radiusTimeout;
    }
    
    /**
     * The amount of time, in seconds, to wait for the RADIUS server to
     * respond.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param radiusTimeout The amount of time, in seconds, to wait for the RADIUS server to
     *         respond.
     */
    public void setRadiusTimeout(Integer radiusTimeout) {
        this.radiusTimeout = radiusTimeout;
    }
    
    /**
     * The amount of time, in seconds, to wait for the RADIUS server to
     * respond.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param radiusTimeout The amount of time, in seconds, to wait for the RADIUS server to
     *         respond.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withRadiusTimeout(Integer radiusTimeout) {
        this.radiusTimeout = radiusTimeout;
        return this;
    }

    /**
     * The maximum number of times that communication with the RADIUS server
     * is attempted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @return The maximum number of times that communication with the RADIUS server
     *         is attempted.
     */
    public Integer getRadiusRetries() {
        return radiusRetries;
    }
    
    /**
     * The maximum number of times that communication with the RADIUS server
     * is attempted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param radiusRetries The maximum number of times that communication with the RADIUS server
     *         is attempted.
     */
    public void setRadiusRetries(Integer radiusRetries) {
        this.radiusRetries = radiusRetries;
    }
    
    /**
     * The maximum number of times that communication with the RADIUS server
     * is attempted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param radiusRetries The maximum number of times that communication with the RADIUS server
     *         is attempted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withRadiusRetries(Integer radiusRetries) {
        this.radiusRetries = radiusRetries;
        return this;
    }

    /**
     * The shared secret code that was specified when your RADIUS endpoints
     * were created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     *
     * @return The shared secret code that was specified when your RADIUS endpoints
     *         were created.
     */
    public String getSharedSecret() {
        return sharedSecret;
    }
    
    /**
     * The shared secret code that was specified when your RADIUS endpoints
     * were created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     *
     * @param sharedSecret The shared secret code that was specified when your RADIUS endpoints
     *         were created.
     */
    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }
    
    /**
     * The shared secret code that was specified when your RADIUS endpoints
     * were created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     *
     * @param sharedSecret The shared secret code that was specified when your RADIUS endpoints
     *         were created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
        return this;
    }

    /**
     * The protocol specified for your RADIUS endpoints.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAP, CHAP, MS-CHAPv1, MS-CHAPv2
     *
     * @return The protocol specified for your RADIUS endpoints.
     *
     * @see RadiusAuthenticationProtocol
     */
    public String getAuthenticationProtocol() {
        return authenticationProtocol;
    }
    
    /**
     * The protocol specified for your RADIUS endpoints.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAP, CHAP, MS-CHAPv1, MS-CHAPv2
     *
     * @param authenticationProtocol The protocol specified for your RADIUS endpoints.
     *
     * @see RadiusAuthenticationProtocol
     */
    public void setAuthenticationProtocol(String authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol;
    }
    
    /**
     * The protocol specified for your RADIUS endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAP, CHAP, MS-CHAPv1, MS-CHAPv2
     *
     * @param authenticationProtocol The protocol specified for your RADIUS endpoints.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RadiusAuthenticationProtocol
     */
    public RadiusSettings withAuthenticationProtocol(String authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol;
        return this;
    }

    /**
     * The protocol specified for your RADIUS endpoints.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAP, CHAP, MS-CHAPv1, MS-CHAPv2
     *
     * @param authenticationProtocol The protocol specified for your RADIUS endpoints.
     *
     * @see RadiusAuthenticationProtocol
     */
    public void setAuthenticationProtocol(RadiusAuthenticationProtocol authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol.toString();
    }
    
    /**
     * The protocol specified for your RADIUS endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAP, CHAP, MS-CHAPv1, MS-CHAPv2
     *
     * @param authenticationProtocol The protocol specified for your RADIUS endpoints.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RadiusAuthenticationProtocol
     */
    public RadiusSettings withAuthenticationProtocol(RadiusAuthenticationProtocol authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol.toString();
        return this;
    }

    /**
     * Not currently used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return Not currently used.
     */
    public String getDisplayLabel() {
        return displayLabel;
    }
    
    /**
     * Not currently used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param displayLabel Not currently used.
     */
    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }
    
    /**
     * Not currently used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param displayLabel Not currently used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
        return this;
    }

    /**
     * Not currently used.
     *
     * @return Not currently used.
     */
    public Boolean isUseSameUsername() {
        return useSameUsername;
    }
    
    /**
     * Not currently used.
     *
     * @param useSameUsername Not currently used.
     */
    public void setUseSameUsername(Boolean useSameUsername) {
        this.useSameUsername = useSameUsername;
    }
    
    /**
     * Not currently used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useSameUsername Not currently used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RadiusSettings withUseSameUsername(Boolean useSameUsername) {
        this.useSameUsername = useSameUsername;
        return this;
    }

    /**
     * Not currently used.
     *
     * @return Not currently used.
     */
    public Boolean getUseSameUsername() {
        return useSameUsername;
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
        if (getRadiusServers() != null) sb.append("RadiusServers: " + getRadiusServers() + ",");
        if (getRadiusPort() != null) sb.append("RadiusPort: " + getRadiusPort() + ",");
        if (getRadiusTimeout() != null) sb.append("RadiusTimeout: " + getRadiusTimeout() + ",");
        if (getRadiusRetries() != null) sb.append("RadiusRetries: " + getRadiusRetries() + ",");
        if (getSharedSecret() != null) sb.append("SharedSecret: " + getSharedSecret() + ",");
        if (getAuthenticationProtocol() != null) sb.append("AuthenticationProtocol: " + getAuthenticationProtocol() + ",");
        if (getDisplayLabel() != null) sb.append("DisplayLabel: " + getDisplayLabel() + ",");
        if (isUseSameUsername() != null) sb.append("UseSameUsername: " + isUseSameUsername() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRadiusServers() == null) ? 0 : getRadiusServers().hashCode()); 
        hashCode = prime * hashCode + ((getRadiusPort() == null) ? 0 : getRadiusPort().hashCode()); 
        hashCode = prime * hashCode + ((getRadiusTimeout() == null) ? 0 : getRadiusTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getRadiusRetries() == null) ? 0 : getRadiusRetries().hashCode()); 
        hashCode = prime * hashCode + ((getSharedSecret() == null) ? 0 : getSharedSecret().hashCode()); 
        hashCode = prime * hashCode + ((getAuthenticationProtocol() == null) ? 0 : getAuthenticationProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getDisplayLabel() == null) ? 0 : getDisplayLabel().hashCode()); 
        hashCode = prime * hashCode + ((isUseSameUsername() == null) ? 0 : isUseSameUsername().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RadiusSettings == false) return false;
        RadiusSettings other = (RadiusSettings)obj;
        
        if (other.getRadiusServers() == null ^ this.getRadiusServers() == null) return false;
        if (other.getRadiusServers() != null && other.getRadiusServers().equals(this.getRadiusServers()) == false) return false; 
        if (other.getRadiusPort() == null ^ this.getRadiusPort() == null) return false;
        if (other.getRadiusPort() != null && other.getRadiusPort().equals(this.getRadiusPort()) == false) return false; 
        if (other.getRadiusTimeout() == null ^ this.getRadiusTimeout() == null) return false;
        if (other.getRadiusTimeout() != null && other.getRadiusTimeout().equals(this.getRadiusTimeout()) == false) return false; 
        if (other.getRadiusRetries() == null ^ this.getRadiusRetries() == null) return false;
        if (other.getRadiusRetries() != null && other.getRadiusRetries().equals(this.getRadiusRetries()) == false) return false; 
        if (other.getSharedSecret() == null ^ this.getSharedSecret() == null) return false;
        if (other.getSharedSecret() != null && other.getSharedSecret().equals(this.getSharedSecret()) == false) return false; 
        if (other.getAuthenticationProtocol() == null ^ this.getAuthenticationProtocol() == null) return false;
        if (other.getAuthenticationProtocol() != null && other.getAuthenticationProtocol().equals(this.getAuthenticationProtocol()) == false) return false; 
        if (other.getDisplayLabel() == null ^ this.getDisplayLabel() == null) return false;
        if (other.getDisplayLabel() != null && other.getDisplayLabel().equals(this.getDisplayLabel()) == false) return false; 
        if (other.isUseSameUsername() == null ^ this.isUseSameUsername() == null) return false;
        if (other.isUseSameUsername() != null && other.isUseSameUsername().equals(this.isUseSameUsername()) == false) return false; 
        return true;
    }
    
    @Override
    public RadiusSettings clone() {
        try {
            return (RadiusSettings) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    