/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#activateGateway(ActivateGatewayRequest) ActivateGateway operation}.
 * <p>
 * This operation activates the gateway you previously deployed on your VMware host. For more information, see DownloadAndDeploy. In the activation
 * process you specify information such as the region you want to use for storing snapshots, the time zone for scheduled snapshots and the gateway
 * schedule window, an activation key, and a name for your gateway. The activation process also associates your gateway with your account.
 * </p>
 * <p>
 * <b>NOTE:</b>You must power on the gateway VM before you can activate your gateway.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#activateGateway(ActivateGatewayRequest)
 */
public class ActivateGatewayRequest extends AmazonWebServiceRequest {

    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address. The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. <p>Length: Minimum length of 1. Maximum
     * length of 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String activationKey;

    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations. <p>Length: Minimum length of 2. Maximum length of
     * 255.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     */
    private String gatewayName;

    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * you want to set for the gateway. The time zone is used, for example,
     * for scheduling snapshots and your gateway's maintenance window.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     */
    private String gatewayTimezone;

    /**
     * A value that indicates the region your gateway is activated in, and
     * where your snapshots are stored. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * .amazonwebservices.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private String gatewayRegion;

    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address. The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. <p>Length: Minimum length of 1. Maximum
     * length of 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway IP
     *         address. The redirect URL returned in the response provides you the
     *         activation key for your gateway in the query string parameter
     *         <code>activationKey</code>. <p>Length: Minimum length of 1. Maximum
     *         length of 50.
     */
    public String getActivationKey() {
        return activationKey;
    }
    
    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address. The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. <p>Length: Minimum length of 1. Maximum
     * length of 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param activationKey Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway IP
     *         address. The redirect URL returned in the response provides you the
     *         activation key for your gateway in the query string parameter
     *         <code>activationKey</code>. <p>Length: Minimum length of 1. Maximum
     *         length of 50.
     */
    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }
    
    /**
     * Your gateway activation key. You can obtain the activation key by
     * sending an HTTP GET request with redirects enabled to the gateway IP
     * address. The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. <p>Length: Minimum length of 1. Maximum
     * length of 50.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param activationKey Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway IP
     *         address. The redirect URL returned in the response provides you the
     *         activation key for your gateway in the query string parameter
     *         <code>activationKey</code>. <p>Length: Minimum length of 1. Maximum
     *         length of 50.
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
     * to other operations. <p>Length: Minimum length of 2. Maximum length of
     * 255.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @return A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations. <p>Length: Minimum length of 2. Maximum length of
     *         255.
     */
    public String getGatewayName() {
        return gatewayName;
    }
    
    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations. <p>Length: Minimum length of 2. Maximum length of
     * 255.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations. <p>Length: Minimum length of 2. Maximum length of
     *         255.
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }
    
    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations. <p>Length: Minimum length of 2. Maximum length of
     * 255.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations. <p>Length: Minimum length of 2. Maximum length of
     *         255.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ActivateGatewayRequest withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * you want to set for the gateway. The time zone is used, for example,
     * for scheduling snapshots and your gateway's maintenance window.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @return One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         you want to set for the gateway. The time zone is used, for example,
     *         for scheduling snapshots and your gateway's maintenance window.
     *
     * @see GatewayTimezone
     */
    public String getGatewayTimezone() {
        return gatewayTimezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * you want to set for the gateway. The time zone is used, for example,
     * for scheduling snapshots and your gateway's maintenance window.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         you want to set for the gateway. The time zone is used, for example,
     *         for scheduling snapshots and your gateway's maintenance window.
     *
     * @see GatewayTimezone
     */
    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * you want to set for the gateway. The time zone is used, for example,
     * for scheduling snapshots and your gateway's maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         you want to set for the gateway. The time zone is used, for example,
     *         for scheduling snapshots and your gateway's maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public ActivateGatewayRequest withGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * you want to set for the gateway. The time zone is used, for example,
     * for scheduling snapshots and your gateway's maintenance window.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         you want to set for the gateway. The time zone is used, for example,
     *         for scheduling snapshots and your gateway's maintenance window.
     *
     * @see GatewayTimezone
     */
    public void setGatewayTimezone(GatewayTimezone gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone.toString();
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * you want to set for the gateway. The time zone is used, for example,
     * for scheduling snapshots and your gateway's maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         you want to set for the gateway. The time zone is used, for example,
     *         for scheduling snapshots and your gateway's maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public ActivateGatewayRequest withGatewayTimezone(GatewayTimezone gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone.toString();
        return this;
    }
    
    /**
     * A value that indicates the region your gateway is activated in, and
     * where your snapshots are stored. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * .amazonwebservices.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return A value that indicates the region your gateway is activated in, and
     *         where your snapshots are stored. For more information about available
     *         regions and endpoints for AWS Storage Gateway, see <a
     *         .amazonwebservices.com/general/latest/gr/rande.html#sg_region">Regions
     *         and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     *         <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *         "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     */
    public String getGatewayRegion() {
        return gatewayRegion;
    }
    
    /**
     * A value that indicates the region your gateway is activated in, and
     * where your snapshots are stored. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * .amazonwebservices.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param gatewayRegion A value that indicates the region your gateway is activated in, and
     *         where your snapshots are stored. For more information about available
     *         regions and endpoints for AWS Storage Gateway, see <a
     *         .amazonwebservices.com/general/latest/gr/rande.html#sg_region">Regions
     *         and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     *         <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *         "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     */
    public void setGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
    }
    
    /**
     * A value that indicates the region your gateway is activated in, and
     * where your snapshots are stored. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * .amazonwebservices.com/general/latest/gr/rande.html#sg_region">Regions
     * and Endpoints</a> in the <b>Amazon Web Services Glossary</b>.
     * <p><i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     * "eu-west-1", "ap-northeast-1", "ap-southest-1", "sa-east-1"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param gatewayRegion A value that indicates the region your gateway is activated in, and
     *         where your snapshots are stored. For more information about available
     *         regions and endpoints for AWS Storage Gateway, see <a
     *         .amazonwebservices.com/general/latest/gr/rande.html#sg_region">Regions
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
        if (activationKey != null) sb.append("ActivationKey: " + activationKey + ", ");
        if (gatewayName != null) sb.append("GatewayName: " + gatewayName + ", ");
        if (gatewayTimezone != null) sb.append("GatewayTimezone: " + gatewayTimezone + ", ");
        if (gatewayRegion != null) sb.append("GatewayRegion: " + gatewayRegion + ", ");
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
        return true;
    }
    
}
    