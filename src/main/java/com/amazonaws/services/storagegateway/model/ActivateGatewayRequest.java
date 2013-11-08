/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#activateGateway(ActivateGatewayRequest) ActivateGateway operation}.
 * <p>
 * This operation activates the gateway you previously deployed on your host. For more information, see <a
 * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/DownloadAndDeploy.html"> Downloading and Deploying AWS Storage Gateway VM </a> . In
 * the activation process you specify information such as the region you want to use for storing snapshots, the time zone for scheduled snapshots and the
 * gateway schedule window, an activation key, and a name for your gateway. The activation process also associates your gateway with your account (see
 * UpdateGatewayInformation).
 * </p>
 * <p>
 * <b>NOTE:</b>You must power on the gateway VM before you can activate your gateway.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#activateGateway(ActivateGatewayRequest)
 */
public class ActivateGatewayRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address (port 80). The redirect URL returned in the response provides
     * you the activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other
     * activation-related parameters, however, these are merely defaults --
     * the arguments you pass to the <code>ActivateGateway</code> API call
     * determine the actual configuration of your gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String activationKey;

    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     */
    private String gatewayName;

    /**
     * One of the values that indicates the time zone you want to set for the
     * gateway. The time zone is used, for example, for scheduling snapshots
     * and your gateway's maintenance schedule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     */
    private String gatewayTimezone;

    /**
     * One of the values that indicates the region where you want to store
     * the snapshot backups. The gateway region specified must be the same
     * region as the region in your <code>Host</code> header in the request.
     * For more information about available regions and endpoints for AWS
     * Storage Gateway, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private String gatewayRegion;

    /**
     * One of the values that defines the type of gateway to activate. The
     * type specified is critical to all later functions of the gateway and
     * cannot be changed after activation. The default value is
     * <code>STORED</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     */
    private String gatewayType;

    private String tapeDriveType;

    private String mediumChangerType;

    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address (port 80). The redirect URL returned in the response provides
     * you the activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other
     * activation-related parameters, however, these are merely defaults --
     * the arguments you pass to the <code>ActivateGateway</code> API call
     * determine the actual configuration of your gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway IP
     *         address (port 80). The redirect URL returned in the response provides
     *         you the activation key for your gateway in the query string parameter
     *         <code>activationKey</code>. It may also include other
     *         activation-related parameters, however, these are merely defaults --
     *         the arguments you pass to the <code>ActivateGateway</code> API call
     *         determine the actual configuration of your gateway.
     */
    public String getActivationKey() {
        return activationKey;
    }
    
    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address (port 80). The redirect URL returned in the response provides
     * you the activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other
     * activation-related parameters, however, these are merely defaults --
     * the arguments you pass to the <code>ActivateGateway</code> API call
     * determine the actual configuration of your gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param activationKey Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway IP
     *         address (port 80). The redirect URL returned in the response provides
     *         you the activation key for your gateway in the query string parameter
     *         <code>activationKey</code>. It may also include other
     *         activation-related parameters, however, these are merely defaults --
     *         the arguments you pass to the <code>ActivateGateway</code> API call
     *         determine the actual configuration of your gateway.
     */
    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }
    
    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address (port 80). The redirect URL returned in the response provides
     * you the activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other
     * activation-related parameters, however, these are merely defaults --
     * the arguments you pass to the <code>ActivateGateway</code> API call
     * determine the actual configuration of your gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param activationKey Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway IP
     *         address (port 80). The redirect URL returned in the response provides
     *         you the activation key for your gateway in the query string parameter
     *         <code>activationKey</code>. It may also include other
     *         activation-related parameters, however, these are merely defaults --
     *         the arguments you pass to the <code>ActivateGateway</code> API call
     *         determine the actual configuration of your gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateGatewayRequest withActivationKey(String activationKey) {
        this.activationKey = activationKey;
        return this;
    }

    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @return A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations.
     */
    public String getGatewayName() {
        return gatewayName;
    }
    
    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations.
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }
    
    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateGatewayRequest withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    /**
     * One of the values that indicates the time zone you want to set for the
     * gateway. The time zone is used, for example, for scheduling snapshots
     * and your gateway's maintenance schedule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return One of the values that indicates the time zone you want to set for the
     *         gateway. The time zone is used, for example, for scheduling snapshots
     *         and your gateway's maintenance schedule.
     */
    public String getGatewayTimezone() {
        return gatewayTimezone;
    }
    
    /**
     * One of the values that indicates the time zone you want to set for the
     * gateway. The time zone is used, for example, for scheduling snapshots
     * and your gateway's maintenance schedule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone One of the values that indicates the time zone you want to set for the
     *         gateway. The time zone is used, for example, for scheduling snapshots
     *         and your gateway's maintenance schedule.
     */
    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }
    
    /**
     * One of the values that indicates the time zone you want to set for the
     * gateway. The time zone is used, for example, for scheduling snapshots
     * and your gateway's maintenance schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone One of the values that indicates the time zone you want to set for the
     *         gateway. The time zone is used, for example, for scheduling snapshots
     *         and your gateway's maintenance schedule.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateGatewayRequest withGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
        return this;
    }

    /**
     * One of the values that indicates the region where you want to store
     * the snapshot backups. The gateway region specified must be the same
     * region as the region in your <code>Host</code> header in the request.
     * For more information about available regions and endpoints for AWS
     * Storage Gateway, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return One of the values that indicates the region where you want to store
     *         the snapshot backups. The gateway region specified must be the same
     *         region as the region in your <code>Host</code> header in the request.
     *         For more information about available regions and endpoints for AWS
     *         Storage Gateway, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions
     *         and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     *         <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *         "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     */
    public String getGatewayRegion() {
        return gatewayRegion;
    }
    
    /**
     * One of the values that indicates the region where you want to store
     * the snapshot backups. The gateway region specified must be the same
     * region as the region in your <code>Host</code> header in the request.
     * For more information about available regions and endpoints for AWS
     * Storage Gateway, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param gatewayRegion One of the values that indicates the region where you want to store
     *         the snapshot backups. The gateway region specified must be the same
     *         region as the region in your <code>Host</code> header in the request.
     *         For more information about available regions and endpoints for AWS
     *         Storage Gateway, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions
     *         and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     *         <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *         "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     */
    public void setGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
    }
    
    /**
     * One of the values that indicates the region where you want to store
     * the snapshot backups. The gateway region specified must be the same
     * region as the region in your <code>Host</code> header in the request.
     * For more information about available regions and endpoints for AWS
     * Storage Gateway, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param gatewayRegion One of the values that indicates the region where you want to store
     *         the snapshot backups. The gateway region specified must be the same
     *         region as the region in your <code>Host</code> header in the request.
     *         For more information about available regions and endpoints for AWS
     *         Storage Gateway, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions
     *         and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     *         <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *         "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateGatewayRequest withGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
        return this;
    }

    /**
     * One of the values that defines the type of gateway to activate. The
     * type specified is critical to all later functions of the gateway and
     * cannot be changed after activation. The default value is
     * <code>STORED</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @return One of the values that defines the type of gateway to activate. The
     *         type specified is critical to all later functions of the gateway and
     *         cannot be changed after activation. The default value is
     *         <code>STORED</code>.
     */
    public String getGatewayType() {
        return gatewayType;
    }
    
    /**
     * One of the values that defines the type of gateway to activate. The
     * type specified is critical to all later functions of the gateway and
     * cannot be changed after activation. The default value is
     * <code>STORED</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType One of the values that defines the type of gateway to activate. The
     *         type specified is critical to all later functions of the gateway and
     *         cannot be changed after activation. The default value is
     *         <code>STORED</code>.
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }
    
    /**
     * One of the values that defines the type of gateway to activate. The
     * type specified is critical to all later functions of the gateway and
     * cannot be changed after activation. The default value is
     * <code>STORED</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType One of the values that defines the type of gateway to activate. The
     *         type specified is critical to all later functions of the gateway and
     *         cannot be changed after activation. The default value is
     *         <code>STORED</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateGatewayRequest withGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Returns the value of the TapeDriveType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @return The value of the TapeDriveType property for this object.
     */
    public String getTapeDriveType() {
        return tapeDriveType;
    }
    
    /**
     * Sets the value of the TapeDriveType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param tapeDriveType The new value for the TapeDriveType property for this object.
     */
    public void setTapeDriveType(String tapeDriveType) {
        this.tapeDriveType = tapeDriveType;
    }
    
    /**
     * Sets the value of the TapeDriveType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param tapeDriveType The new value for the TapeDriveType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateGatewayRequest withTapeDriveType(String tapeDriveType) {
        this.tapeDriveType = tapeDriveType;
        return this;
    }

    /**
     * Returns the value of the MediumChangerType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @return The value of the MediumChangerType property for this object.
     */
    public String getMediumChangerType() {
        return mediumChangerType;
    }
    
    /**
     * Sets the value of the MediumChangerType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param mediumChangerType The new value for the MediumChangerType property for this object.
     */
    public void setMediumChangerType(String mediumChangerType) {
        this.mediumChangerType = mediumChangerType;
    }
    
    /**
     * Sets the value of the MediumChangerType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param mediumChangerType The new value for the MediumChangerType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateGatewayRequest withMediumChangerType(String mediumChangerType) {
        this.mediumChangerType = mediumChangerType;
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
        if (getActivationKey() != null) sb.append("ActivationKey: " + getActivationKey() + ",");
        if (getGatewayName() != null) sb.append("GatewayName: " + getGatewayName() + ",");
        if (getGatewayTimezone() != null) sb.append("GatewayTimezone: " + getGatewayTimezone() + ",");
        if (getGatewayRegion() != null) sb.append("GatewayRegion: " + getGatewayRegion() + ",");
        if (getGatewayType() != null) sb.append("GatewayType: " + getGatewayType() + ",");
        if (getTapeDriveType() != null) sb.append("TapeDriveType: " + getTapeDriveType() + ",");
        if (getMediumChangerType() != null) sb.append("MediumChangerType: " + getMediumChangerType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivationKey() == null) ? 0 : getActivationKey().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayRegion() == null) ? 0 : getGatewayRegion().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode()); 
        hashCode = prime * hashCode + ((getTapeDriveType() == null) ? 0 : getTapeDriveType().hashCode()); 
        hashCode = prime * hashCode + ((getMediumChangerType() == null) ? 0 : getMediumChangerType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivateGatewayRequest == false) return false;
        ActivateGatewayRequest other = (ActivateGatewayRequest)obj;
        
        if (other.getActivationKey() == null ^ this.getActivationKey() == null) return false;
        if (other.getActivationKey() != null && other.getActivationKey().equals(this.getActivationKey()) == false) return false; 
        if (other.getGatewayName() == null ^ this.getGatewayName() == null) return false;
        if (other.getGatewayName() != null && other.getGatewayName().equals(this.getGatewayName()) == false) return false; 
        if (other.getGatewayTimezone() == null ^ this.getGatewayTimezone() == null) return false;
        if (other.getGatewayTimezone() != null && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false) return false; 
        if (other.getGatewayRegion() == null ^ this.getGatewayRegion() == null) return false;
        if (other.getGatewayRegion() != null && other.getGatewayRegion().equals(this.getGatewayRegion()) == false) return false; 
        if (other.getGatewayType() == null ^ this.getGatewayType() == null) return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false) return false; 
        if (other.getTapeDriveType() == null ^ this.getTapeDriveType() == null) return false;
        if (other.getTapeDriveType() != null && other.getTapeDriveType().equals(this.getTapeDriveType()) == false) return false; 
        if (other.getMediumChangerType() == null ^ this.getMediumChangerType() == null) return false;
        if (other.getMediumChangerType() != null && other.getMediumChangerType().equals(this.getMediumChangerType()) == false) return false; 
        return true;
    }
    
}
    