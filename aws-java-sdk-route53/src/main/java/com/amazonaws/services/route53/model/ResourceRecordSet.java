/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about the current resource record
 * set.
 * </p>
 */
public class ResourceRecordSet implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example,
     * <code>www.example.com</code>. You can optionally include a trailing dot.
     * If you omit the trailing dot, Amazon Route 53 still assumes that the
     * domain name that you specify is fully qualified. This means that Amazon
     * Route 53 treats <code>www.example.com</code> (without a trailing dot) and
     * <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than a-z, 0-9, and
     * - (hyphen) and how to specify internationalized domain names, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can use an asterisk (*) character in the name. DNS treats the *
     * character either as a wildcard or as the * character (ASCII 42),
     * depending on where it appears in the name. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     * >Using an Asterisk (*) in the Names of Hosted Zones and Resource Record
     * Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     * </p>
     * <important>You can't use the * wildcard for resource records sets that
     * have a type of NS.</important>
     */
    private String name;
    /**
     * <p>
     * The DNS record type. For information about different record types and how
     * data is encoded for them, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     * <code>NS</code> | <code>PTR</code> | <code>SOA</code> | <code>SPF</code>
     * | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code>
     * | <code>TXT</code>. When creating a group of weighted, latency,
     * geolocation, or failover resource record sets, specify the same value for
     * all of the resource record sets in the group.
     * </p>
     * <note>SPF records were formerly used to verify the identity of the sender
     * of email messages. However, we no longer recommend that you create
     * resource record sets for which the value of <code>Type</code> is
     * <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for
     * Authorizing Use of Domains in Email, Version 1</i>, has been updated to
     * say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a
     * href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.</note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li><b>CloudFront distributions:</b> <code>A</code></li>
     * <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     * <li><b>Amazon S3 buckets:</b> A</li>
     * <li><b>Another resource record set in this hosted zone:</b> Specify the
     * type of the resource record set for which you're creating the alias.
     * Specify any value except <code>NS</code> or <code>SOA</code>.</li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets that
     * have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set
     * that has the same combination of DNS name and type.
     * </p>
     */
    private String setIdentifier;
    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines the proportion of DNS queries that Amazon Route 53 responds to
     * using the current resource record set. Amazon Route 53 calculates the sum
     * of the weights for the resource record sets that have the same
     * combination of DNS name and type. Amazon Route 53 then responds to
     * queries based on the ratio of a resource's weight to the total. Note the
     * following:
     * </p>
     * <ul>
     * <li>You must specify a value for the <code>Weight</code> element for
     * every weighted resource record set.</li>
     * <li>You can only specify one <code>ResourceRecord</code> per weighted
     * resource record set.</li>
     * <li>You cannot create latency, failover, or geolocation resource record
     * sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as weighted resource record sets.</li>
     * <li>You can create a maximum of 100 weighted resource record sets that
     * have the same values for the <code>Name</code> and <code>Type</code>
     * elements.</li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set
     * <code>Weight</code> to <code>0</code> for a resource record set, Amazon
     * Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set <code>Weight</code> to
     * <code>0</code> for all resource record sets that have the same
     * combination of DNS name and type, traffic is routed to all resources with
     * equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different
     * when you associate health checks with weighted resource record sets. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     * >Options for Configuring Amazon Route 53 Active-Active and Active-Passive
     * Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private Long weight;
    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 region
     * where the resource that is specified in this resource record set resides.
     * The resource typically is an AWS resource, such as an Amazon EC2 instance
     * or an ELB load balancer, and is referred to by an IP address or a DNS
     * domain name, depending on the record type.
     * </p>
     * <note>You can create latency and latency alias resource record sets only
     * in public hosted zones.</note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for
     * which you have created latency resource record sets, Amazon Route 53
     * selects the latency resource record set that has the lowest latency
     * between the end user and the associated Amazon EC2 region. Amazon Route
     * 53 then returns the value that is associated with the selected resource
     * record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You can only specify one <code>ResourceRecord</code> per latency
     * resource record set.</li>
     * <li>You can only create one latency resource record set for each Amazon
     * EC2 region.</li>
     * <li>You are not required to create latency resource record sets for all
     * Amazon EC2 regions. Amazon Route 53 will choose the region with the best
     * latency from among the regions for which you create latency resource
     * record sets.</li>
     * <li>You cannot create non-latency resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * latency resource record sets.</li>
     * </ul>
     */
    private String region;
    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets
     * you control how Amazon Route 53 responds to DNS queries based on the
     * geographic origin of the query. For example, if you want all queries from
     * Africa to be routed to a web server with an IP address of
     * <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of
     * <code>AF</code>.
     * </p>
     * <note>You can create geolocation and geolocation alias resource record
     * sets only in public hosted zones.</note>
     * <p>
     * If you create separate resource record sets for overlapping geographic
     * regions (for example, one resource record set for a continent and one for
     * a country on the same continent), priority goes to the smallest
     * geographic region. This allows you to route most queries for a continent
     * to one resource and to route queries for a country on that continent to a
     * different resource.
     * </p>
     * <p>
     * You cannot create two geolocation resource record sets that specify the
     * same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches
     * all geographic locations that aren't specified in other geolocation
     * resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * <important>Geolocation works by mapping IP addresses to locations.
     * However, some IP addresses aren't mapped to geographic locations, so even
     * if you create geolocation resource record sets that cover all seven
     * continents, Amazon Route 53 will receive some DNS queries from locations
     * that it can't identify. We recommend that you create a resource record
     * set for which the value of <code>CountryCode</code> is <code>*</code>,
     * which handles both queries that come from locations for which you haven't
     * created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code>
     * resource record set, Amazon Route 53 returns a "no answer" response for
     * queries from those locations.</important>
     * <p>
     * You cannot create non-geolocation resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * geolocation resource record sets.
     * </p>
     */
    private GeoLocation geoLocation;
    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add
     * the <code>Failover</code> element to two resource record sets. For one
     * resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify
     * <code>SECONDARY</code>. In addition, you include the
     * <code>HealthCheckId</code> element and specify the health check that you
     * want Amazon Route 53 to perform for each resource record set.
     * </p>
     * <note>You can create failover and failover alias resource record sets
     * only in public hosted zones.</note>
     * <p>
     * Except where noted, the following failover behaviors assume that you have
     * included the <code>HealthCheckId</code> element in both resource record
     * sets:
     * </p>
     * <ul>
     * <li>When the primary resource record set is healthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the secondary resource
     * record set.</li>
     * <li>When the primary resource record set is unhealthy and the secondary
     * resource record set is healthy, Amazon Route 53 responds to DNS queries
     * with the applicable value from the secondary resource record set.</li>
     * <li>When the secondary resource record set is unhealthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the primary resource
     * record set.</li>
     * <li>If you omit the <code>HealthCheckId</code> element for the secondary
     * resource record set, and if the primary resource record set is unhealthy,
     * Amazon Route 53 always responds to DNS queries with the applicable value
     * from the secondary resource record set. This is true regardless of the
     * health of the associated endpoint.</li>
     * </ul>
     * <p>
     * You cannot create non-failover resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the
     * <code>EvaluateTargetHealth</code> element and set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see
     * <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>PRIMARY</code> | <code>SECONDARY</code>
     * </p>
     */
    private String failover;
    /**
     * <p>
     * The cache time to live for the current resource record set. Note the
     * following:
     * </p>
     * <ul>
     * <li>If you're creating an alias resource record set, omit
     * <code>TTL</code>. Amazon Route 53 uses the value of <code>TTL</code> for
     * the alias target.</li>
     * <li>If you're associating this resource record set with a health check
     * (if you're adding a <code>HealthCheckId</code> element), we recommend
     * that you specify a <code>TTL</code> of 60 seconds or less so clients
     * respond quickly to changes in health status.</li>
     * <li>All of the resource record sets in a group of weighted, latency,
     * geolocation, or failover resource record sets must have the same value
     * for <code>TTL</code>.</li>
     * <li>If a group of weighted resource record sets includes one or more
     * weighted alias resource record sets for which the alias target is an ELB
     * load balancer, we recommend that you specify a <code>TTL</code> of 60
     * seconds for all of the non-alias weighted resource record sets that have
     * the same name and type. Values other than 60 seconds (the TTL for load
     * balancers) will change the effect of the values that you specify for
     * <code>Weight</code>.</li>
     * </ul>
     */
    private Long tTL;
    /**
     * <p>
     * A complex type that contains the resource records for the current
     * resource record set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceRecord> resourceRecords;
    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     * </p>
     */
    private AliasTarget aliasTarget;
    /**
     * <p>
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify health
     * check associated with the resource record set.
     * </p>
     */
    private String healthCheckId;

    private String trafficPolicyInstanceId;

    /**
     * Default constructor for ResourceRecordSet object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public ResourceRecordSet() {
    }

    /**
     * Constructs a new ResourceRecordSet object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example,
     *        <code>www.example.com</code>. You can optionally include a
     *        trailing dot. If you omit the trailing dot, Amazon Route 53 still
     *        assumes that the domain name that you specify is fully qualified.
     *        This means that Amazon Route 53 treats
     *        <code>www.example.com</code> (without a trailing dot) and
     *        <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than a-z,
     *        0-9, and - (hyphen) and how to specify internationalized domain
     *        names, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *        >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     *        </p>
     *        <p>
     *        You can use an asterisk (*) character in the name. DNS treats the
     *        * character either as a wildcard or as the * character (ASCII 42),
     *        depending on where it appears in the name. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     *        >Using an Asterisk (*) in the Names of Hosted Zones and Resource
     *        Record Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     *        </p>
     *        <important>You can't use the * wildcard for resource records sets
     *        that have a type of NS.
     * @param type
     *        The DNS record type. For information about different record types
     *        and how data is encoded for them, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *        >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     *        <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource
     *        record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>PTR</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When
     *        creating a group of weighted, latency, geolocation, or failover
     *        resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <note>SPF records were formerly used to verify the identity of the
     *        sender of email messages. However, we no longer recommend that you
     *        create resource record sets for which the value of
     *        <code>Type</code> is <code>SPF</code>. RFC 7208, <i>Sender Policy
     *        Framework (SPF) for Authorizing Use of Domains in Email, Version
     *        1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a
     *        href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.</note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li><b>CloudFront distributions:</b> <code>A</code></li>
     *        <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     *        <li><b>Amazon S3 buckets:</b> A</li>
     *        <li><b>Another resource record set in this hosted zone:</b>
     *        Specify the type of the resource record set for which you're
     *        creating the alias. Specify any value except <code>NS</code> or
     *        <code>SOA</code>.</li>
     */
    public ResourceRecordSet(String name, String type) {
        setName(name);
        setType(type);
    }

    /**
     * Constructs a new ResourceRecordSet object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example,
     *        <code>www.example.com</code>. You can optionally include a
     *        trailing dot. If you omit the trailing dot, Amazon Route 53 still
     *        assumes that the domain name that you specify is fully qualified.
     *        This means that Amazon Route 53 treats
     *        <code>www.example.com</code> (without a trailing dot) and
     *        <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than a-z,
     *        0-9, and - (hyphen) and how to specify internationalized domain
     *        names, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *        >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     *        </p>
     *        <p>
     *        You can use an asterisk (*) character in the name. DNS treats the
     *        * character either as a wildcard or as the * character (ASCII 42),
     *        depending on where it appears in the name. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     *        >Using an Asterisk (*) in the Names of Hosted Zones and Resource
     *        Record Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     *        </p>
     *        <important>You can't use the * wildcard for resource records sets
     *        that have a type of NS.
     * @param type
     *        The DNS record type. For information about different record types
     *        and how data is encoded for them, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *        >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     *        <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource
     *        record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>PTR</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When
     *        creating a group of weighted, latency, geolocation, or failover
     *        resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <note>SPF records were formerly used to verify the identity of the
     *        sender of email messages. However, we no longer recommend that you
     *        create resource record sets for which the value of
     *        <code>Type</code> is <code>SPF</code>. RFC 7208, <i>Sender Policy
     *        Framework (SPF) for Authorizing Use of Domains in Email, Version
     *        1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a
     *        href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.</note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li><b>CloudFront distributions:</b> <code>A</code></li>
     *        <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     *        <li><b>Amazon S3 buckets:</b> A</li>
     *        <li><b>Another resource record set in this hosted zone:</b>
     *        Specify the type of the resource record set for which you're
     *        creating the alias. Specify any value except <code>NS</code> or
     *        <code>SOA</code>.</li>
     */
    public ResourceRecordSet(String name, RRType type) {
        setName(name);
        setType(type.toString());
    }

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example,
     * <code>www.example.com</code>. You can optionally include a trailing dot.
     * If you omit the trailing dot, Amazon Route 53 still assumes that the
     * domain name that you specify is fully qualified. This means that Amazon
     * Route 53 treats <code>www.example.com</code> (without a trailing dot) and
     * <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than a-z, 0-9, and
     * - (hyphen) and how to specify internationalized domain names, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can use an asterisk (*) character in the name. DNS treats the *
     * character either as a wildcard or as the * character (ASCII 42),
     * depending on where it appears in the name. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     * >Using an Asterisk (*) in the Names of Hosted Zones and Resource Record
     * Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     * </p>
     * <important>You can't use the * wildcard for resource records sets that
     * have a type of NS.</important>
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example,
     *        <code>www.example.com</code>. You can optionally include a
     *        trailing dot. If you omit the trailing dot, Amazon Route 53 still
     *        assumes that the domain name that you specify is fully qualified.
     *        This means that Amazon Route 53 treats
     *        <code>www.example.com</code> (without a trailing dot) and
     *        <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than a-z,
     *        0-9, and - (hyphen) and how to specify internationalized domain
     *        names, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *        >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     *        </p>
     *        <p>
     *        You can use an asterisk (*) character in the name. DNS treats the
     *        * character either as a wildcard or as the * character (ASCII 42),
     *        depending on where it appears in the name. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     *        >Using an Asterisk (*) in the Names of Hosted Zones and Resource
     *        Record Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     *        </p>
     *        <important>You can't use the * wildcard for resource records sets
     *        that have a type of NS.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example,
     * <code>www.example.com</code>. You can optionally include a trailing dot.
     * If you omit the trailing dot, Amazon Route 53 still assumes that the
     * domain name that you specify is fully qualified. This means that Amazon
     * Route 53 treats <code>www.example.com</code> (without a trailing dot) and
     * <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than a-z, 0-9, and
     * - (hyphen) and how to specify internationalized domain names, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can use an asterisk (*) character in the name. DNS treats the *
     * character either as a wildcard or as the * character (ASCII 42),
     * depending on where it appears in the name. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     * >Using an Asterisk (*) in the Names of Hosted Zones and Resource Record
     * Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     * </p>
     * <important>You can't use the * wildcard for resource records sets that
     * have a type of NS.</important>
     * 
     * @return The name of the domain you want to perform the action on.</p>
     *         <p>
     *         Enter a fully qualified domain name, for example,
     *         <code>www.example.com</code>. You can optionally include a
     *         trailing dot. If you omit the trailing dot, Amazon Route 53 still
     *         assumes that the domain name that you specify is fully qualified.
     *         This means that Amazon Route 53 treats
     *         <code>www.example.com</code> (without a trailing dot) and
     *         <code>www.example.com.</code> (with a trailing dot) as identical.
     *         </p>
     *         <p>
     *         For information about how to specify characters other than a-z,
     *         0-9, and - (hyphen) and how to specify internationalized domain
     *         names, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *         >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *         </p>
     *         <p>
     *         You can use an asterisk (*) character in the name. DNS treats the
     *         * character either as a wildcard or as the * character (ASCII
     *         42), depending on where it appears in the name. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     *         >Using an Asterisk (*) in the Names of Hosted Zones and Resource
     *         Record Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     *         </p>
     *         <important>You can't use the * wildcard for resource records sets
     *         that have a type of NS.
     */
    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain you want to perform the action on.
     * </p>
     * <p>
     * Enter a fully qualified domain name, for example,
     * <code>www.example.com</code>. You can optionally include a trailing dot.
     * If you omit the trailing dot, Amazon Route 53 still assumes that the
     * domain name that you specify is fully qualified. This means that Amazon
     * Route 53 treats <code>www.example.com</code> (without a trailing dot) and
     * <code>www.example.com.</code> (with a trailing dot) as identical.
     * </p>
     * <p>
     * For information about how to specify characters other than a-z, 0-9, and
     * - (hyphen) and how to specify internationalized domain names, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can use an asterisk (*) character in the name. DNS treats the *
     * character either as a wildcard or as the * character (ASCII 42),
     * depending on where it appears in the name. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     * >Using an Asterisk (*) in the Names of Hosted Zones and Resource Record
     * Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     * </p>
     * <important>You can't use the * wildcard for resource records sets that
     * have a type of NS.</important>
     * 
     * @param name
     *        The name of the domain you want to perform the action on.</p>
     *        <p>
     *        Enter a fully qualified domain name, for example,
     *        <code>www.example.com</code>. You can optionally include a
     *        trailing dot. If you omit the trailing dot, Amazon Route 53 still
     *        assumes that the domain name that you specify is fully qualified.
     *        This means that Amazon Route 53 treats
     *        <code>www.example.com</code> (without a trailing dot) and
     *        <code>www.example.com.</code> (with a trailing dot) as identical.
     *        </p>
     *        <p>
     *        For information about how to specify characters other than a-z,
     *        0-9, and - (hyphen) and how to specify internationalized domain
     *        names, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *        >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     *        </p>
     *        <p>
     *        You can use an asterisk (*) character in the name. DNS treats the
     *        * character either as a wildcard or as the * character (ASCII 42),
     *        depending on where it appears in the name. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-asterisk"
     *        >Using an Asterisk (*) in the Names of Hosted Zones and Resource
     *        Record Sets</a> in the <i>Amazon Route 53 Developer Guide</i>
     *        </p>
     *        <important>You can't use the * wildcard for resource records sets
     *        that have a type of NS.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how
     * data is encoded for them, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     * <code>NS</code> | <code>PTR</code> | <code>SOA</code> | <code>SPF</code>
     * | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code>
     * | <code>TXT</code>. When creating a group of weighted, latency,
     * geolocation, or failover resource record sets, specify the same value for
     * all of the resource record sets in the group.
     * </p>
     * <note>SPF records were formerly used to verify the identity of the sender
     * of email messages. However, we no longer recommend that you create
     * resource record sets for which the value of <code>Type</code> is
     * <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for
     * Authorizing Use of Domains in Email, Version 1</i>, has been updated to
     * say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a
     * href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.</note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li><b>CloudFront distributions:</b> <code>A</code></li>
     * <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     * <li><b>Amazon S3 buckets:</b> A</li>
     * <li><b>Another resource record set in this hosted zone:</b> Specify the
     * type of the resource record set for which you're creating the alias.
     * Specify any value except <code>NS</code> or <code>SOA</code>.</li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types
     *        and how data is encoded for them, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *        >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     *        <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource
     *        record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>PTR</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When
     *        creating a group of weighted, latency, geolocation, or failover
     *        resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <note>SPF records were formerly used to verify the identity of the
     *        sender of email messages. However, we no longer recommend that you
     *        create resource record sets for which the value of
     *        <code>Type</code> is <code>SPF</code>. RFC 7208, <i>Sender Policy
     *        Framework (SPF) for Authorizing Use of Domains in Email, Version
     *        1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a
     *        href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.</note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li><b>CloudFront distributions:</b> <code>A</code></li>
     *        <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     *        <li><b>Amazon S3 buckets:</b> A</li>
     *        <li><b>Another resource record set in this hosted zone:</b>
     *        Specify the type of the resource record set for which you're
     *        creating the alias. Specify any value except <code>NS</code> or
     *        <code>SOA</code>.</li>
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how
     * data is encoded for them, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     * <code>NS</code> | <code>PTR</code> | <code>SOA</code> | <code>SPF</code>
     * | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code>
     * | <code>TXT</code>. When creating a group of weighted, latency,
     * geolocation, or failover resource record sets, specify the same value for
     * all of the resource record sets in the group.
     * </p>
     * <note>SPF records were formerly used to verify the identity of the sender
     * of email messages. However, we no longer recommend that you create
     * resource record sets for which the value of <code>Type</code> is
     * <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for
     * Authorizing Use of Domains in Email, Version 1</i>, has been updated to
     * say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a
     * href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.</note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li><b>CloudFront distributions:</b> <code>A</code></li>
     * <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     * <li><b>Amazon S3 buckets:</b> A</li>
     * <li><b>Another resource record set in this hosted zone:</b> Specify the
     * type of the resource record set for which you're creating the alias.
     * Specify any value except <code>NS</code> or <code>SOA</code>.</li>
     * </ul>
     * 
     * @return The DNS record type. For information about different record types
     *         and how data is encoded for them, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *         >Supported DNS Resource Record Types</a> in the <i>Amazon Route
     *         53 Developer Guide</i>.</p>
     *         <p>
     *         Valid values for basic resource record sets: <code>A</code> |
     *         <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     *         <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     *         <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for weighted, latency, geolocation, and failover resource
     *         record sets: <code>A</code> | <code>AAAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>PTR</code> |
     *         <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When
     *         creating a group of weighted, latency, geolocation, or failover
     *         resource record sets, specify the same value for all of the
     *         resource record sets in the group.
     *         </p>
     *         <note>SPF records were formerly used to verify the identity of
     *         the sender of email messages. However, we no longer recommend
     *         that you create resource record sets for which the value of
     *         <code>Type</code> is <code>SPF</code>. RFC 7208, <i>Sender Policy
     *         Framework (SPF) for Authorizing Use of Domains in Email, Version
     *         1</i>, has been updated to say,
     *         "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *         In RFC 7208, see section 14.1, <a
     *         href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF
     *         DNS Record Type</a>.</note>
     *         <p>
     *         Values for alias resource record sets:
     *         </p>
     *         <ul>
     *         <li><b>CloudFront distributions:</b> <code>A</code></li>
     *         <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code>
     *         </li>
     *         <li><b>Amazon S3 buckets:</b> A</li>
     *         <li><b>Another resource record set in this hosted zone:</b>
     *         Specify the type of the resource record set for which you're
     *         creating the alias. Specify any value except <code>NS</code> or
     *         <code>SOA</code>.</li>
     * @see RRType
     */
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how
     * data is encoded for them, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     * <code>NS</code> | <code>PTR</code> | <code>SOA</code> | <code>SPF</code>
     * | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code>
     * | <code>TXT</code>. When creating a group of weighted, latency,
     * geolocation, or failover resource record sets, specify the same value for
     * all of the resource record sets in the group.
     * </p>
     * <note>SPF records were formerly used to verify the identity of the sender
     * of email messages. However, we no longer recommend that you create
     * resource record sets for which the value of <code>Type</code> is
     * <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for
     * Authorizing Use of Domains in Email, Version 1</i>, has been updated to
     * say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a
     * href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.</note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li><b>CloudFront distributions:</b> <code>A</code></li>
     * <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     * <li><b>Amazon S3 buckets:</b> A</li>
     * <li><b>Another resource record set in this hosted zone:</b> Specify the
     * type of the resource record set for which you're creating the alias.
     * Specify any value except <code>NS</code> or <code>SOA</code>.</li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types
     *        and how data is encoded for them, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *        >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     *        <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource
     *        record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>PTR</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When
     *        creating a group of weighted, latency, geolocation, or failover
     *        resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <note>SPF records were formerly used to verify the identity of the
     *        sender of email messages. However, we no longer recommend that you
     *        create resource record sets for which the value of
     *        <code>Type</code> is <code>SPF</code>. RFC 7208, <i>Sender Policy
     *        Framework (SPF) for Authorizing Use of Domains in Email, Version
     *        1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a
     *        href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.</note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li><b>CloudFront distributions:</b> <code>A</code></li>
     *        <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     *        <li><b>Amazon S3 buckets:</b> A</li>
     *        <li><b>Another resource record set in this hosted zone:</b>
     *        Specify the type of the resource record set for which you're
     *        creating the alias. Specify any value except <code>NS</code> or
     *        <code>SOA</code>.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ResourceRecordSet withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how
     * data is encoded for them, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     * <code>NS</code> | <code>PTR</code> | <code>SOA</code> | <code>SPF</code>
     * | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code>
     * | <code>TXT</code>. When creating a group of weighted, latency,
     * geolocation, or failover resource record sets, specify the same value for
     * all of the resource record sets in the group.
     * </p>
     * <note>SPF records were formerly used to verify the identity of the sender
     * of email messages. However, we no longer recommend that you create
     * resource record sets for which the value of <code>Type</code> is
     * <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for
     * Authorizing Use of Domains in Email, Version 1</i>, has been updated to
     * say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a
     * href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.</note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li><b>CloudFront distributions:</b> <code>A</code></li>
     * <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     * <li><b>Amazon S3 buckets:</b> A</li>
     * <li><b>Another resource record set in this hosted zone:</b> Specify the
     * type of the resource record set for which you're creating the alias.
     * Specify any value except <code>NS</code> or <code>SOA</code>.</li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types
     *        and how data is encoded for them, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *        >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     *        <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource
     *        record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>PTR</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When
     *        creating a group of weighted, latency, geolocation, or failover
     *        resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <note>SPF records were formerly used to verify the identity of the
     *        sender of email messages. However, we no longer recommend that you
     *        create resource record sets for which the value of
     *        <code>Type</code> is <code>SPF</code>. RFC 7208, <i>Sender Policy
     *        Framework (SPF) for Authorizing Use of Domains in Email, Version
     *        1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a
     *        href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.</note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li><b>CloudFront distributions:</b> <code>A</code></li>
     *        <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     *        <li><b>Amazon S3 buckets:</b> A</li>
     *        <li><b>Another resource record set in this hosted zone:</b>
     *        Specify the type of the resource record set for which you're
     *        creating the alias. Specify any value except <code>NS</code> or
     *        <code>SOA</code>.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The DNS record type. For information about different record types and how
     * data is encoded for them, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     * <code>NS</code> | <code>PTR</code> | <code>SOA</code> | <code>SPF</code>
     * | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record
     * sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>PTR</code> | <code>SPF</code> | <code>SRV</code>
     * | <code>TXT</code>. When creating a group of weighted, latency,
     * geolocation, or failover resource record sets, specify the same value for
     * all of the resource record sets in the group.
     * </p>
     * <note>SPF records were formerly used to verify the identity of the sender
     * of email messages. However, we no longer recommend that you create
     * resource record sets for which the value of <code>Type</code> is
     * <code>SPF</code>. RFC 7208, <i>Sender Policy Framework (SPF) for
     * Authorizing Use of Domains in Email, Version 1</i>, has been updated to
     * say,
     * "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     * In RFC 7208, see section 14.1, <a
     * href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS Record
     * Type</a>.</note>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li><b>CloudFront distributions:</b> <code>A</code></li>
     * <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     * <li><b>Amazon S3 buckets:</b> A</li>
     * <li><b>Another resource record set in this hosted zone:</b> Specify the
     * type of the resource record set for which you're creating the alias.
     * Specify any value except <code>NS</code> or <code>SOA</code>.</li>
     * </ul>
     * 
     * @param type
     *        The DNS record type. For information about different record types
     *        and how data is encoded for them, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *        >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>MX</code> |
     *        <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource
     *        record sets: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>PTR</code> |
     *        <code>SPF</code> | <code>SRV</code> | <code>TXT</code>. When
     *        creating a group of weighted, latency, geolocation, or failover
     *        resource record sets, specify the same value for all of the
     *        resource record sets in the group.
     *        </p>
     *        <note>SPF records were formerly used to verify the identity of the
     *        sender of email messages. However, we no longer recommend that you
     *        create resource record sets for which the value of
     *        <code>Type</code> is <code>SPF</code>. RFC 7208, <i>Sender Policy
     *        Framework (SPF) for Authorizing Use of Domains in Email, Version
     *        1</i>, has been updated to say,
     *        "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it."
     *        In RFC 7208, see section 14.1, <a
     *        href="http://tools.ietf.org/html/rfc7208#section-14.1">The SPF DNS
     *        Record Type</a>.</note>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li><b>CloudFront distributions:</b> <code>A</code></li>
     *        <li><b>ELB load balancers:</b> <code>A</code> | <code>AAAA</code></li>
     *        <li><b>Amazon S3 buckets:</b> A</li>
     *        <li><b>Another resource record set in this hosted zone:</b>
     *        Specify the type of the resource record set for which you're
     *        creating the alias. Specify any value except <code>NS</code> or
     *        <code>SOA</code>.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ResourceRecordSet withType(RRType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets that
     * have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set
     * that has the same combination of DNS name and type.
     * </p>
     * 
     * @param setIdentifier
     *        Weighted, Latency, Geo, and Failover resource record sets
     *        only:</i> An identifier that differentiates among multiple
     *        resource record sets that have the same combination of DNS name
     *        and type. The value of <code>SetIdentifier
     */
    public void setSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
    }

    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets that
     * have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set
     * that has the same combination of DNS name and type.
     * </p>
     * 
     * @return Weighted, Latency, Geo, and Failover resource record sets
     *         only:</i> An identifier that differentiates among multiple
     *         resource record sets that have the same combination of DNS name
     *         and type. The value of <code>SetIdentifier
     */
    public String getSetIdentifier() {
        return this.setIdentifier;
    }

    /**
     * <p>
     * <i>Weighted, Latency, Geo, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets that
     * have the same combination of DNS name and type. The value of
     * <code>SetIdentifier</code> must be unique for each resource record set
     * that has the same combination of DNS name and type.
     * </p>
     * 
     * @param setIdentifier
     *        Weighted, Latency, Geo, and Failover resource record sets
     *        only:</i> An identifier that differentiates among multiple
     *        resource record sets that have the same combination of DNS name
     *        and type. The value of <code>SetIdentifier
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withSetIdentifier(String setIdentifier) {
        setSetIdentifier(setIdentifier);
        return this;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines the proportion of DNS queries that Amazon Route 53 responds to
     * using the current resource record set. Amazon Route 53 calculates the sum
     * of the weights for the resource record sets that have the same
     * combination of DNS name and type. Amazon Route 53 then responds to
     * queries based on the ratio of a resource's weight to the total. Note the
     * following:
     * </p>
     * <ul>
     * <li>You must specify a value for the <code>Weight</code> element for
     * every weighted resource record set.</li>
     * <li>You can only specify one <code>ResourceRecord</code> per weighted
     * resource record set.</li>
     * <li>You cannot create latency, failover, or geolocation resource record
     * sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as weighted resource record sets.</li>
     * <li>You can create a maximum of 100 weighted resource record sets that
     * have the same values for the <code>Name</code> and <code>Type</code>
     * elements.</li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set
     * <code>Weight</code> to <code>0</code> for a resource record set, Amazon
     * Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set <code>Weight</code> to
     * <code>0</code> for all resource record sets that have the same
     * combination of DNS name and type, traffic is routed to all resources with
     * equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different
     * when you associate health checks with weighted resource record sets. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     * >Options for Configuring Amazon Route 53 Active-Active and Active-Passive
     * Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param weight
     *        Weighted resource record sets only:</i> Among resource record sets
     *        that have the same combination of DNS name and type, a value that
     *        determines the proportion of DNS queries that Amazon Route 53
     *        responds to using the current resource record set. Amazon Route 53
     *        calculates the sum of the weights for the resource record sets
     *        that have the same combination of DNS name and type. Amazon Route
     *        53 then responds to queries based on the ratio of a resource's
     *        weight to the total. Note the following:</p>
     *        <ul>
     *        <li>You must specify a value for the <code>Weight</code> element
     *        for every weighted resource record set.</li>
     *        <li>You can only specify one <code>ResourceRecord</code> per
     *        weighted resource record set.</li>
     *        <li>You cannot create latency, failover, or geolocation resource
     *        record sets that have the same values for the <code>Name</code>
     *        and <code>Type</code> elements as weighted resource record sets.</li>
     *        <li>You can create a maximum of 100 weighted resource record sets
     *        that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements.</li>
     *        <li>
     *        <p>
     *        For weighted (but not weighted alias) resource record sets, if you
     *        set <code>Weight</code> to <code>0</code> for a resource record
     *        set, Amazon Route 53 never responds to queries with the applicable
     *        value for that resource record set. However, if you set
     *        <code>Weight</code> to <code>0</code> for all resource record sets
     *        that have the same combination of DNS name and type, traffic is
     *        routed to all resources with equal probability.
     *        </p>
     *        <p>
     *        The effect of setting <code>Weight</code> to <code>0</code> is
     *        different when you associate health checks with weighted resource
     *        record sets. For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     *        >Options for Configuring Amazon Route 53 Active-Active and
     *        Active-Passive Failover</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     *        </p>
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines the proportion of DNS queries that Amazon Route 53 responds to
     * using the current resource record set. Amazon Route 53 calculates the sum
     * of the weights for the resource record sets that have the same
     * combination of DNS name and type. Amazon Route 53 then responds to
     * queries based on the ratio of a resource's weight to the total. Note the
     * following:
     * </p>
     * <ul>
     * <li>You must specify a value for the <code>Weight</code> element for
     * every weighted resource record set.</li>
     * <li>You can only specify one <code>ResourceRecord</code> per weighted
     * resource record set.</li>
     * <li>You cannot create latency, failover, or geolocation resource record
     * sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as weighted resource record sets.</li>
     * <li>You can create a maximum of 100 weighted resource record sets that
     * have the same values for the <code>Name</code> and <code>Type</code>
     * elements.</li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set
     * <code>Weight</code> to <code>0</code> for a resource record set, Amazon
     * Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set <code>Weight</code> to
     * <code>0</code> for all resource record sets that have the same
     * combination of DNS name and type, traffic is routed to all resources with
     * equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different
     * when you associate health checks with weighted resource record sets. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     * >Options for Configuring Amazon Route 53 Active-Active and Active-Passive
     * Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Weighted resource record sets only:</i> Among resource record
     *         sets that have the same combination of DNS name and type, a value
     *         that determines the proportion of DNS queries that Amazon Route
     *         53 responds to using the current resource record set. Amazon
     *         Route 53 calculates the sum of the weights for the resource
     *         record sets that have the same combination of DNS name and type.
     *         Amazon Route 53 then responds to queries based on the ratio of a
     *         resource's weight to the total. Note the following:</p>
     *         <ul>
     *         <li>You must specify a value for the <code>Weight</code> element
     *         for every weighted resource record set.</li>
     *         <li>You can only specify one <code>ResourceRecord</code> per
     *         weighted resource record set.</li>
     *         <li>You cannot create latency, failover, or geolocation resource
     *         record sets that have the same values for the <code>Name</code>
     *         and <code>Type</code> elements as weighted resource record sets.</li>
     *         <li>You can create a maximum of 100 weighted resource record sets
     *         that have the same values for the <code>Name</code> and
     *         <code>Type</code> elements.</li>
     *         <li>
     *         <p>
     *         For weighted (but not weighted alias) resource record sets, if
     *         you set <code>Weight</code> to <code>0</code> for a resource
     *         record set, Amazon Route 53 never responds to queries with the
     *         applicable value for that resource record set. However, if you
     *         set <code>Weight</code> to <code>0</code> for all resource record
     *         sets that have the same combination of DNS name and type, traffic
     *         is routed to all resources with equal probability.
     *         </p>
     *         <p>
     *         The effect of setting <code>Weight</code> to <code>0</code> is
     *         different when you associate health checks with weighted resource
     *         record sets. For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     *         >Options for Configuring Amazon Route 53 Active-Active and
     *         Active-Passive Failover</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *         </p>
     */
    public Long getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines the proportion of DNS queries that Amazon Route 53 responds to
     * using the current resource record set. Amazon Route 53 calculates the sum
     * of the weights for the resource record sets that have the same
     * combination of DNS name and type. Amazon Route 53 then responds to
     * queries based on the ratio of a resource's weight to the total. Note the
     * following:
     * </p>
     * <ul>
     * <li>You must specify a value for the <code>Weight</code> element for
     * every weighted resource record set.</li>
     * <li>You can only specify one <code>ResourceRecord</code> per weighted
     * resource record set.</li>
     * <li>You cannot create latency, failover, or geolocation resource record
     * sets that have the same values for the <code>Name</code> and
     * <code>Type</code> elements as weighted resource record sets.</li>
     * <li>You can create a maximum of 100 weighted resource record sets that
     * have the same values for the <code>Name</code> and <code>Type</code>
     * elements.</li>
     * <li>
     * <p>
     * For weighted (but not weighted alias) resource record sets, if you set
     * <code>Weight</code> to <code>0</code> for a resource record set, Amazon
     * Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set <code>Weight</code> to
     * <code>0</code> for all resource record sets that have the same
     * combination of DNS name and type, traffic is routed to all resources with
     * equal probability.
     * </p>
     * <p>
     * The effect of setting <code>Weight</code> to <code>0</code> is different
     * when you associate health checks with weighted resource record sets. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     * >Options for Configuring Amazon Route 53 Active-Active and Active-Passive
     * Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param weight
     *        Weighted resource record sets only:</i> Among resource record sets
     *        that have the same combination of DNS name and type, a value that
     *        determines the proportion of DNS queries that Amazon Route 53
     *        responds to using the current resource record set. Amazon Route 53
     *        calculates the sum of the weights for the resource record sets
     *        that have the same combination of DNS name and type. Amazon Route
     *        53 then responds to queries based on the ratio of a resource's
     *        weight to the total. Note the following:</p>
     *        <ul>
     *        <li>You must specify a value for the <code>Weight</code> element
     *        for every weighted resource record set.</li>
     *        <li>You can only specify one <code>ResourceRecord</code> per
     *        weighted resource record set.</li>
     *        <li>You cannot create latency, failover, or geolocation resource
     *        record sets that have the same values for the <code>Name</code>
     *        and <code>Type</code> elements as weighted resource record sets.</li>
     *        <li>You can create a maximum of 100 weighted resource record sets
     *        that have the same values for the <code>Name</code> and
     *        <code>Type</code> elements.</li>
     *        <li>
     *        <p>
     *        For weighted (but not weighted alias) resource record sets, if you
     *        set <code>Weight</code> to <code>0</code> for a resource record
     *        set, Amazon Route 53 never responds to queries with the applicable
     *        value for that resource record set. However, if you set
     *        <code>Weight</code> to <code>0</code> for all resource record sets
     *        that have the same combination of DNS name and type, traffic is
     *        routed to all resources with equal probability.
     *        </p>
     *        <p>
     *        The effect of setting <code>Weight</code> to <code>0</code> is
     *        different when you associate health checks with weighted resource
     *        record sets. For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html"
     *        >Options for Configuring Amazon Route 53 Active-Active and
     *        Active-Passive Failover</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withWeight(Long weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 region
     * where the resource that is specified in this resource record set resides.
     * The resource typically is an AWS resource, such as an Amazon EC2 instance
     * or an ELB load balancer, and is referred to by an IP address or a DNS
     * domain name, depending on the record type.
     * </p>
     * <note>You can create latency and latency alias resource record sets only
     * in public hosted zones.</note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for
     * which you have created latency resource record sets, Amazon Route 53
     * selects the latency resource record set that has the lowest latency
     * between the end user and the associated Amazon EC2 region. Amazon Route
     * 53 then returns the value that is associated with the selected resource
     * record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You can only specify one <code>ResourceRecord</code> per latency
     * resource record set.</li>
     * <li>You can only create one latency resource record set for each Amazon
     * EC2 region.</li>
     * <li>You are not required to create latency resource record sets for all
     * Amazon EC2 regions. Amazon Route 53 will choose the region with the best
     * latency from among the regions for which you create latency resource
     * record sets.</li>
     * <li>You cannot create non-latency resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * latency resource record sets.</li>
     * </ul>
     * 
     * @param region
     *        Latency-based resource record sets only:</i> The Amazon EC2 region
     *        where the resource that is specified in this resource record set
     *        resides. The resource typically is an AWS resource, such as an
     *        Amazon EC2 instance or an ELB load balancer, and is referred to by
     *        an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>You can create latency and latency alias resource
     *        record sets only in public hosted zones.</note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and
     *        type for which you have created latency resource record sets,
     *        Amazon Route 53 selects the latency resource record set that has
     *        the lowest latency between the end user and the associated Amazon
     *        EC2 region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>You can only specify one <code>ResourceRecord</code> per
     *        latency resource record set.</li>
     *        <li>You can only create one latency resource record set for each
     *        Amazon EC2 region.</li>
     *        <li>You are not required to create latency resource record sets
     *        for all Amazon EC2 regions. Amazon Route 53 will choose the region
     *        with the best latency from among the regions for which you create
     *        latency resource record sets.</li>
     *        <li>You cannot create non-latency resource record sets that have
     *        the same values for the <code>Name</code> and <code>Type</code>
     *        elements as latency resource record sets.
     * @see ResourceRecordSetRegion
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 region
     * where the resource that is specified in this resource record set resides.
     * The resource typically is an AWS resource, such as an Amazon EC2 instance
     * or an ELB load balancer, and is referred to by an IP address or a DNS
     * domain name, depending on the record type.
     * </p>
     * <note>You can create latency and latency alias resource record sets only
     * in public hosted zones.</note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for
     * which you have created latency resource record sets, Amazon Route 53
     * selects the latency resource record set that has the lowest latency
     * between the end user and the associated Amazon EC2 region. Amazon Route
     * 53 then returns the value that is associated with the selected resource
     * record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You can only specify one <code>ResourceRecord</code> per latency
     * resource record set.</li>
     * <li>You can only create one latency resource record set for each Amazon
     * EC2 region.</li>
     * <li>You are not required to create latency resource record sets for all
     * Amazon EC2 regions. Amazon Route 53 will choose the region with the best
     * latency from among the regions for which you create latency resource
     * record sets.</li>
     * <li>You cannot create non-latency resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * latency resource record sets.</li>
     * </ul>
     * 
     * @return Latency-based resource record sets only:</i> The Amazon EC2
     *         region where the resource that is specified in this resource
     *         record set resides. The resource typically is an AWS resource,
     *         such as an Amazon EC2 instance or an ELB load balancer, and is
     *         referred to by an IP address or a DNS domain name, depending on
     *         the record type.</p> <note>You can create latency and latency
     *         alias resource record sets only in public hosted zones.</note>
     *         <p>
     *         When Amazon Route 53 receives a DNS query for a domain name and
     *         type for which you have created latency resource record sets,
     *         Amazon Route 53 selects the latency resource record set that has
     *         the lowest latency between the end user and the associated Amazon
     *         EC2 region. Amazon Route 53 then returns the value that is
     *         associated with the selected resource record set.
     *         </p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>You can only specify one <code>ResourceRecord</code> per
     *         latency resource record set.</li>
     *         <li>You can only create one latency resource record set for each
     *         Amazon EC2 region.</li>
     *         <li>You are not required to create latency resource record sets
     *         for all Amazon EC2 regions. Amazon Route 53 will choose the
     *         region with the best latency from among the regions for which you
     *         create latency resource record sets.</li>
     *         <li>You cannot create non-latency resource record sets that have
     *         the same values for the <code>Name</code> and <code>Type</code>
     *         elements as latency resource record sets.
     * @see ResourceRecordSetRegion
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 region
     * where the resource that is specified in this resource record set resides.
     * The resource typically is an AWS resource, such as an Amazon EC2 instance
     * or an ELB load balancer, and is referred to by an IP address or a DNS
     * domain name, depending on the record type.
     * </p>
     * <note>You can create latency and latency alias resource record sets only
     * in public hosted zones.</note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for
     * which you have created latency resource record sets, Amazon Route 53
     * selects the latency resource record set that has the lowest latency
     * between the end user and the associated Amazon EC2 region. Amazon Route
     * 53 then returns the value that is associated with the selected resource
     * record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You can only specify one <code>ResourceRecord</code> per latency
     * resource record set.</li>
     * <li>You can only create one latency resource record set for each Amazon
     * EC2 region.</li>
     * <li>You are not required to create latency resource record sets for all
     * Amazon EC2 regions. Amazon Route 53 will choose the region with the best
     * latency from among the regions for which you create latency resource
     * record sets.</li>
     * <li>You cannot create non-latency resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * latency resource record sets.</li>
     * </ul>
     * 
     * @param region
     *        Latency-based resource record sets only:</i> The Amazon EC2 region
     *        where the resource that is specified in this resource record set
     *        resides. The resource typically is an AWS resource, such as an
     *        Amazon EC2 instance or an ELB load balancer, and is referred to by
     *        an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>You can create latency and latency alias resource
     *        record sets only in public hosted zones.</note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and
     *        type for which you have created latency resource record sets,
     *        Amazon Route 53 selects the latency resource record set that has
     *        the lowest latency between the end user and the associated Amazon
     *        EC2 region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>You can only specify one <code>ResourceRecord</code> per
     *        latency resource record set.</li>
     *        <li>You can only create one latency resource record set for each
     *        Amazon EC2 region.</li>
     *        <li>You are not required to create latency resource record sets
     *        for all Amazon EC2 regions. Amazon Route 53 will choose the region
     *        with the best latency from among the regions for which you create
     *        latency resource record sets.</li>
     *        <li>You cannot create non-latency resource record sets that have
     *        the same values for the <code>Name</code> and <code>Type</code>
     *        elements as latency resource record sets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceRecordSetRegion
     */
    public ResourceRecordSet withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 region
     * where the resource that is specified in this resource record set resides.
     * The resource typically is an AWS resource, such as an Amazon EC2 instance
     * or an ELB load balancer, and is referred to by an IP address or a DNS
     * domain name, depending on the record type.
     * </p>
     * <note>You can create latency and latency alias resource record sets only
     * in public hosted zones.</note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for
     * which you have created latency resource record sets, Amazon Route 53
     * selects the latency resource record set that has the lowest latency
     * between the end user and the associated Amazon EC2 region. Amazon Route
     * 53 then returns the value that is associated with the selected resource
     * record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You can only specify one <code>ResourceRecord</code> per latency
     * resource record set.</li>
     * <li>You can only create one latency resource record set for each Amazon
     * EC2 region.</li>
     * <li>You are not required to create latency resource record sets for all
     * Amazon EC2 regions. Amazon Route 53 will choose the region with the best
     * latency from among the regions for which you create latency resource
     * record sets.</li>
     * <li>You cannot create non-latency resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * latency resource record sets.</li>
     * </ul>
     * 
     * @param region
     *        Latency-based resource record sets only:</i> The Amazon EC2 region
     *        where the resource that is specified in this resource record set
     *        resides. The resource typically is an AWS resource, such as an
     *        Amazon EC2 instance or an ELB load balancer, and is referred to by
     *        an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>You can create latency and latency alias resource
     *        record sets only in public hosted zones.</note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and
     *        type for which you have created latency resource record sets,
     *        Amazon Route 53 selects the latency resource record set that has
     *        the lowest latency between the end user and the associated Amazon
     *        EC2 region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>You can only specify one <code>ResourceRecord</code> per
     *        latency resource record set.</li>
     *        <li>You can only create one latency resource record set for each
     *        Amazon EC2 region.</li>
     *        <li>You are not required to create latency resource record sets
     *        for all Amazon EC2 regions. Amazon Route 53 will choose the region
     *        with the best latency from among the regions for which you create
     *        latency resource record sets.</li>
     *        <li>You cannot create non-latency resource record sets that have
     *        the same values for the <code>Name</code> and <code>Type</code>
     *        elements as latency resource record sets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceRecordSetRegion
     */
    public void setRegion(ResourceRecordSetRegion region) {
        this.region = region.toString();
    }

    /**
     * <p>
     * <i>Latency-based resource record sets only:</i> The Amazon EC2 region
     * where the resource that is specified in this resource record set resides.
     * The resource typically is an AWS resource, such as an Amazon EC2 instance
     * or an ELB load balancer, and is referred to by an IP address or a DNS
     * domain name, depending on the record type.
     * </p>
     * <note>You can create latency and latency alias resource record sets only
     * in public hosted zones.</note>
     * <p>
     * When Amazon Route 53 receives a DNS query for a domain name and type for
     * which you have created latency resource record sets, Amazon Route 53
     * selects the latency resource record set that has the lowest latency
     * between the end user and the associated Amazon EC2 region. Amazon Route
     * 53 then returns the value that is associated with the selected resource
     * record set.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You can only specify one <code>ResourceRecord</code> per latency
     * resource record set.</li>
     * <li>You can only create one latency resource record set for each Amazon
     * EC2 region.</li>
     * <li>You are not required to create latency resource record sets for all
     * Amazon EC2 regions. Amazon Route 53 will choose the region with the best
     * latency from among the regions for which you create latency resource
     * record sets.</li>
     * <li>You cannot create non-latency resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * latency resource record sets.</li>
     * </ul>
     * 
     * @param region
     *        Latency-based resource record sets only:</i> The Amazon EC2 region
     *        where the resource that is specified in this resource record set
     *        resides. The resource typically is an AWS resource, such as an
     *        Amazon EC2 instance or an ELB load balancer, and is referred to by
     *        an IP address or a DNS domain name, depending on the record
     *        type.</p> <note>You can create latency and latency alias resource
     *        record sets only in public hosted zones.</note>
     *        <p>
     *        When Amazon Route 53 receives a DNS query for a domain name and
     *        type for which you have created latency resource record sets,
     *        Amazon Route 53 selects the latency resource record set that has
     *        the lowest latency between the end user and the associated Amazon
     *        EC2 region. Amazon Route 53 then returns the value that is
     *        associated with the selected resource record set.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>You can only specify one <code>ResourceRecord</code> per
     *        latency resource record set.</li>
     *        <li>You can only create one latency resource record set for each
     *        Amazon EC2 region.</li>
     *        <li>You are not required to create latency resource record sets
     *        for all Amazon EC2 regions. Amazon Route 53 will choose the region
     *        with the best latency from among the regions for which you create
     *        latency resource record sets.</li>
     *        <li>You cannot create non-latency resource record sets that have
     *        the same values for the <code>Name</code> and <code>Type</code>
     *        elements as latency resource record sets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceRecordSetRegion
     */
    public ResourceRecordSet withRegion(ResourceRecordSetRegion region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets
     * you control how Amazon Route 53 responds to DNS queries based on the
     * geographic origin of the query. For example, if you want all queries from
     * Africa to be routed to a web server with an IP address of
     * <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of
     * <code>AF</code>.
     * </p>
     * <note>You can create geolocation and geolocation alias resource record
     * sets only in public hosted zones.</note>
     * <p>
     * If you create separate resource record sets for overlapping geographic
     * regions (for example, one resource record set for a continent and one for
     * a country on the same continent), priority goes to the smallest
     * geographic region. This allows you to route most queries for a continent
     * to one resource and to route queries for a country on that continent to a
     * different resource.
     * </p>
     * <p>
     * You cannot create two geolocation resource record sets that specify the
     * same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches
     * all geographic locations that aren't specified in other geolocation
     * resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * <important>Geolocation works by mapping IP addresses to locations.
     * However, some IP addresses aren't mapped to geographic locations, so even
     * if you create geolocation resource record sets that cover all seven
     * continents, Amazon Route 53 will receive some DNS queries from locations
     * that it can't identify. We recommend that you create a resource record
     * set for which the value of <code>CountryCode</code> is <code>*</code>,
     * which handles both queries that come from locations for which you haven't
     * created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code>
     * resource record set, Amazon Route 53 returns a "no answer" response for
     * queries from those locations.</important>
     * <p>
     * You cannot create non-geolocation resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * geolocation resource record sets.
     * </p>
     * 
     * @param geoLocation
     *        Geo location resource record sets only:</i> A complex type that
     *        lets you control how Amazon Route 53 responds to DNS queries based
     *        on the geographic origin of the query. For example, if you want
     *        all queries from Africa to be routed to a web server with an IP
     *        address of <code>192.0.2.111</code>, create a resource record set
     *        with a <code>Type</code> of <code>A</code> and a
     *        <code>ContinentCode</code> of <code>AF</code>.</p> <note>You can
     *        create geolocation and geolocation alias resource record sets only
     *        in public hosted zones.</note>
     *        <p>
     *        If you create separate resource record sets for overlapping
     *        geographic regions (for example, one resource record set for a
     *        continent and one for a country on the same continent), priority
     *        goes to the smallest geographic region. This allows you to route
     *        most queries for a continent to one resource and to route queries
     *        for a country on that continent to a different resource.
     *        </p>
     *        <p>
     *        You cannot create two geolocation resource record sets that
     *        specify the same geographic location.
     *        </p>
     *        <p>
     *        The value <code>*</code> in the <code>CountryCode</code> element
     *        matches all geographic locations that aren't specified in other
     *        geolocation resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements.
     *        </p>
     *        <important>Geolocation works by mapping IP addresses to locations.
     *        However, some IP addresses aren't mapped to geographic locations,
     *        so even if you create geolocation resource record sets that cover
     *        all seven continents, Amazon Route 53 will receive some DNS
     *        queries from locations that it can't identify. We recommend that
     *        you create a resource record set for which the value of
     *        <code>CountryCode</code> is <code>*</code>, which handles both
     *        queries that come from locations for which you haven't created
     *        geolocation resource record sets and queries from IP addresses
     *        that aren't mapped to a location. If you don't create a
     *        <code>*</code> resource record set, Amazon Route 53 returns a
     *        "no answer" response for queries from those locations.</important>
     *        <p>
     *        You cannot create non-geolocation resource record sets that have
     *        the same values for the <code>Name</code> and <code>Type
     */
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets
     * you control how Amazon Route 53 responds to DNS queries based on the
     * geographic origin of the query. For example, if you want all queries from
     * Africa to be routed to a web server with an IP address of
     * <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of
     * <code>AF</code>.
     * </p>
     * <note>You can create geolocation and geolocation alias resource record
     * sets only in public hosted zones.</note>
     * <p>
     * If you create separate resource record sets for overlapping geographic
     * regions (for example, one resource record set for a continent and one for
     * a country on the same continent), priority goes to the smallest
     * geographic region. This allows you to route most queries for a continent
     * to one resource and to route queries for a country on that continent to a
     * different resource.
     * </p>
     * <p>
     * You cannot create two geolocation resource record sets that specify the
     * same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches
     * all geographic locations that aren't specified in other geolocation
     * resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * <important>Geolocation works by mapping IP addresses to locations.
     * However, some IP addresses aren't mapped to geographic locations, so even
     * if you create geolocation resource record sets that cover all seven
     * continents, Amazon Route 53 will receive some DNS queries from locations
     * that it can't identify. We recommend that you create a resource record
     * set for which the value of <code>CountryCode</code> is <code>*</code>,
     * which handles both queries that come from locations for which you haven't
     * created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code>
     * resource record set, Amazon Route 53 returns a "no answer" response for
     * queries from those locations.</important>
     * <p>
     * You cannot create non-geolocation resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * geolocation resource record sets.
     * </p>
     * 
     * @return Geo location resource record sets only:</i> A complex type that
     *         lets you control how Amazon Route 53 responds to DNS queries
     *         based on the geographic origin of the query. For example, if you
     *         want all queries from Africa to be routed to a web server with an
     *         IP address of <code>192.0.2.111</code>, create a resource record
     *         set with a <code>Type</code> of <code>A</code> and a
     *         <code>ContinentCode</code> of <code>AF</code>.</p> <note>You can
     *         create geolocation and geolocation alias resource record sets
     *         only in public hosted zones.</note>
     *         <p>
     *         If you create separate resource record sets for overlapping
     *         geographic regions (for example, one resource record set for a
     *         continent and one for a country on the same continent), priority
     *         goes to the smallest geographic region. This allows you to route
     *         most queries for a continent to one resource and to route queries
     *         for a country on that continent to a different resource.
     *         </p>
     *         <p>
     *         You cannot create two geolocation resource record sets that
     *         specify the same geographic location.
     *         </p>
     *         <p>
     *         The value <code>*</code> in the <code>CountryCode</code> element
     *         matches all geographic locations that aren't specified in other
     *         geolocation resource record sets that have the same values for
     *         the <code>Name</code> and <code>Type</code> elements.
     *         </p>
     *         <important>Geolocation works by mapping IP addresses to
     *         locations. However, some IP addresses aren't mapped to geographic
     *         locations, so even if you create geolocation resource record sets
     *         that cover all seven continents, Amazon Route 53 will receive
     *         some DNS queries from locations that it can't identify. We
     *         recommend that you create a resource record set for which the
     *         value of <code>CountryCode</code> is <code>*</code>, which
     *         handles both queries that come from locations for which you
     *         haven't created geolocation resource record sets and queries from
     *         IP addresses that aren't mapped to a location. If you don't
     *         create a <code>*</code> resource record set, Amazon Route 53
     *         returns a "no answer" response for queries from those
     *         locations.</important>
     *         <p>
     *         You cannot create non-geolocation resource record sets that have
     *         the same values for the <code>Name</code> and <code>Type
     */
    public GeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    /**
     * <p>
     * <i>Geo location resource record sets only:</i> A complex type that lets
     * you control how Amazon Route 53 responds to DNS queries based on the
     * geographic origin of the query. For example, if you want all queries from
     * Africa to be routed to a web server with an IP address of
     * <code>192.0.2.111</code>, create a resource record set with a
     * <code>Type</code> of <code>A</code> and a <code>ContinentCode</code> of
     * <code>AF</code>.
     * </p>
     * <note>You can create geolocation and geolocation alias resource record
     * sets only in public hosted zones.</note>
     * <p>
     * If you create separate resource record sets for overlapping geographic
     * regions (for example, one resource record set for a continent and one for
     * a country on the same continent), priority goes to the smallest
     * geographic region. This allows you to route most queries for a continent
     * to one resource and to route queries for a country on that continent to a
     * different resource.
     * </p>
     * <p>
     * You cannot create two geolocation resource record sets that specify the
     * same geographic location.
     * </p>
     * <p>
     * The value <code>*</code> in the <code>CountryCode</code> element matches
     * all geographic locations that aren't specified in other geolocation
     * resource record sets that have the same values for the <code>Name</code>
     * and <code>Type</code> elements.
     * </p>
     * <important>Geolocation works by mapping IP addresses to locations.
     * However, some IP addresses aren't mapped to geographic locations, so even
     * if you create geolocation resource record sets that cover all seven
     * continents, Amazon Route 53 will receive some DNS queries from locations
     * that it can't identify. We recommend that you create a resource record
     * set for which the value of <code>CountryCode</code> is <code>*</code>,
     * which handles both queries that come from locations for which you haven't
     * created geolocation resource record sets and queries from IP addresses
     * that aren't mapped to a location. If you don't create a <code>*</code>
     * resource record set, Amazon Route 53 returns a "no answer" response for
     * queries from those locations.</important>
     * <p>
     * You cannot create non-geolocation resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * geolocation resource record sets.
     * </p>
     * 
     * @param geoLocation
     *        Geo location resource record sets only:</i> A complex type that
     *        lets you control how Amazon Route 53 responds to DNS queries based
     *        on the geographic origin of the query. For example, if you want
     *        all queries from Africa to be routed to a web server with an IP
     *        address of <code>192.0.2.111</code>, create a resource record set
     *        with a <code>Type</code> of <code>A</code> and a
     *        <code>ContinentCode</code> of <code>AF</code>.</p> <note>You can
     *        create geolocation and geolocation alias resource record sets only
     *        in public hosted zones.</note>
     *        <p>
     *        If you create separate resource record sets for overlapping
     *        geographic regions (for example, one resource record set for a
     *        continent and one for a country on the same continent), priority
     *        goes to the smallest geographic region. This allows you to route
     *        most queries for a continent to one resource and to route queries
     *        for a country on that continent to a different resource.
     *        </p>
     *        <p>
     *        You cannot create two geolocation resource record sets that
     *        specify the same geographic location.
     *        </p>
     *        <p>
     *        The value <code>*</code> in the <code>CountryCode</code> element
     *        matches all geographic locations that aren't specified in other
     *        geolocation resource record sets that have the same values for the
     *        <code>Name</code> and <code>Type</code> elements.
     *        </p>
     *        <important>Geolocation works by mapping IP addresses to locations.
     *        However, some IP addresses aren't mapped to geographic locations,
     *        so even if you create geolocation resource record sets that cover
     *        all seven continents, Amazon Route 53 will receive some DNS
     *        queries from locations that it can't identify. We recommend that
     *        you create a resource record set for which the value of
     *        <code>CountryCode</code> is <code>*</code>, which handles both
     *        queries that come from locations for which you haven't created
     *        geolocation resource record sets and queries from IP addresses
     *        that aren't mapped to a location. If you don't create a
     *        <code>*</code> resource record set, Amazon Route 53 returns a
     *        "no answer" response for queries from those locations.</important>
     *        <p>
     *        You cannot create non-geolocation resource record sets that have
     *        the same values for the <code>Name</code> and <code>Type
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withGeoLocation(GeoLocation geoLocation) {
        setGeoLocation(geoLocation);
        return this;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add
     * the <code>Failover</code> element to two resource record sets. For one
     * resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify
     * <code>SECONDARY</code>. In addition, you include the
     * <code>HealthCheckId</code> element and specify the health check that you
     * want Amazon Route 53 to perform for each resource record set.
     * </p>
     * <note>You can create failover and failover alias resource record sets
     * only in public hosted zones.</note>
     * <p>
     * Except where noted, the following failover behaviors assume that you have
     * included the <code>HealthCheckId</code> element in both resource record
     * sets:
     * </p>
     * <ul>
     * <li>When the primary resource record set is healthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the secondary resource
     * record set.</li>
     * <li>When the primary resource record set is unhealthy and the secondary
     * resource record set is healthy, Amazon Route 53 responds to DNS queries
     * with the applicable value from the secondary resource record set.</li>
     * <li>When the secondary resource record set is unhealthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the primary resource
     * record set.</li>
     * <li>If you omit the <code>HealthCheckId</code> element for the secondary
     * resource record set, and if the primary resource record set is unhealthy,
     * Amazon Route 53 always responds to DNS queries with the applicable value
     * from the secondary resource record set. This is true regardless of the
     * health of the associated endpoint.</li>
     * </ul>
     * <p>
     * You cannot create non-failover resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the
     * <code>EvaluateTargetHealth</code> element and set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see
     * <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>PRIMARY</code> | <code>SECONDARY</code>
     * </p>
     * 
     * @param failover
     *        Failover resource record sets only:</i> To configure failover, you
     *        add the <code>Failover</code> element to two resource record sets.
     *        For one resource record set, you specify <code>PRIMARY</code> as
     *        the value for <code>Failover</code>; for the other resource record
     *        set, you specify <code>SECONDARY</code>. In addition, you include
     *        the <code>HealthCheckId</code> element and specify the health
     *        check that you want Amazon Route 53 to perform for each resource
     *        record set.</p> <note>You can create failover and failover alias
     *        resource record sets only in public hosted zones.</note>
     *        <p>
     *        Except where noted, the following failover behaviors assume that
     *        you have included the <code>HealthCheckId</code> element in both
     *        resource record sets:
     *        </p>
     *        <ul>
     *        <li>When the primary resource record set is healthy, Amazon Route
     *        53 responds to DNS queries with the applicable value from the
     *        primary resource record set regardless of the health of the
     *        secondary resource record set.</li>
     *        <li>When the primary resource record set is unhealthy and the
     *        secondary resource record set is healthy, Amazon Route 53 responds
     *        to DNS queries with the applicable value from the secondary
     *        resource record set.</li>
     *        <li>When the secondary resource record set is unhealthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from
     *        the primary resource record set regardless of the health of the
     *        primary resource record set.</li>
     *        <li>If you omit the <code>HealthCheckId</code> element for the
     *        secondary resource record set, and if the primary resource record
     *        set is unhealthy, Amazon Route 53 always responds to DNS queries
     *        with the applicable value from the secondary resource record set.
     *        This is true regardless of the health of the associated endpoint.</li>
     *        </ul>
     *        <p>
     *        You cannot create non-failover resource record sets that have the
     *        same values for the <code>Name</code> and <code>Type</code>
     *        elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the
     *        <code>EvaluateTargetHealth</code> element and set the value to
     *        true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route
     *        53, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *        >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *        <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>PRIMARY</code> | <code>SECONDARY
     * @see ResourceRecordSetFailover
     */
    public void setFailover(String failover) {
        this.failover = failover;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add
     * the <code>Failover</code> element to two resource record sets. For one
     * resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify
     * <code>SECONDARY</code>. In addition, you include the
     * <code>HealthCheckId</code> element and specify the health check that you
     * want Amazon Route 53 to perform for each resource record set.
     * </p>
     * <note>You can create failover and failover alias resource record sets
     * only in public hosted zones.</note>
     * <p>
     * Except where noted, the following failover behaviors assume that you have
     * included the <code>HealthCheckId</code> element in both resource record
     * sets:
     * </p>
     * <ul>
     * <li>When the primary resource record set is healthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the secondary resource
     * record set.</li>
     * <li>When the primary resource record set is unhealthy and the secondary
     * resource record set is healthy, Amazon Route 53 responds to DNS queries
     * with the applicable value from the secondary resource record set.</li>
     * <li>When the secondary resource record set is unhealthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the primary resource
     * record set.</li>
     * <li>If you omit the <code>HealthCheckId</code> element for the secondary
     * resource record set, and if the primary resource record set is unhealthy,
     * Amazon Route 53 always responds to DNS queries with the applicable value
     * from the secondary resource record set. This is true regardless of the
     * health of the associated endpoint.</li>
     * </ul>
     * <p>
     * You cannot create non-failover resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the
     * <code>EvaluateTargetHealth</code> element and set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see
     * <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>PRIMARY</code> | <code>SECONDARY</code>
     * </p>
     * 
     * @return Failover resource record sets only:</i> To configure failover,
     *         you add the <code>Failover</code> element to two resource record
     *         sets. For one resource record set, you specify
     *         <code>PRIMARY</code> as the value for <code>Failover</code>; for
     *         the other resource record set, you specify <code>SECONDARY</code>
     *         . In addition, you include the <code>HealthCheckId</code> element
     *         and specify the health check that you want Amazon Route 53 to
     *         perform for each resource record set.</p> <note>You can create
     *         failover and failover alias resource record sets only in public
     *         hosted zones.</note>
     *         <p>
     *         Except where noted, the following failover behaviors assume that
     *         you have included the <code>HealthCheckId</code> element in both
     *         resource record sets:
     *         </p>
     *         <ul>
     *         <li>When the primary resource record set is healthy, Amazon Route
     *         53 responds to DNS queries with the applicable value from the
     *         primary resource record set regardless of the health of the
     *         secondary resource record set.</li>
     *         <li>When the primary resource record set is unhealthy and the
     *         secondary resource record set is healthy, Amazon Route 53
     *         responds to DNS queries with the applicable value from the
     *         secondary resource record set.</li>
     *         <li>When the secondary resource record set is unhealthy, Amazon
     *         Route 53 responds to DNS queries with the applicable value from
     *         the primary resource record set regardless of the health of the
     *         primary resource record set.</li>
     *         <li>If you omit the <code>HealthCheckId</code> element for the
     *         secondary resource record set, and if the primary resource record
     *         set is unhealthy, Amazon Route 53 always responds to DNS queries
     *         with the applicable value from the secondary resource record set.
     *         This is true regardless of the health of the associated endpoint.
     *         </li>
     *         </ul>
     *         <p>
     *         You cannot create non-failover resource record sets that have the
     *         same values for the <code>Name</code> and <code>Type</code>
     *         elements as failover resource record sets.
     *         </p>
     *         <p>
     *         For failover alias resource record sets, you must also include
     *         the <code>EvaluateTargetHealth</code> element and set the value
     *         to true.
     *         </p>
     *         <p>
     *         For more information about configuring failover for Amazon Route
     *         53, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *         >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         Valid values: <code>PRIMARY</code> | <code>SECONDARY
     * @see ResourceRecordSetFailover
     */
    public String getFailover() {
        return this.failover;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add
     * the <code>Failover</code> element to two resource record sets. For one
     * resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify
     * <code>SECONDARY</code>. In addition, you include the
     * <code>HealthCheckId</code> element and specify the health check that you
     * want Amazon Route 53 to perform for each resource record set.
     * </p>
     * <note>You can create failover and failover alias resource record sets
     * only in public hosted zones.</note>
     * <p>
     * Except where noted, the following failover behaviors assume that you have
     * included the <code>HealthCheckId</code> element in both resource record
     * sets:
     * </p>
     * <ul>
     * <li>When the primary resource record set is healthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the secondary resource
     * record set.</li>
     * <li>When the primary resource record set is unhealthy and the secondary
     * resource record set is healthy, Amazon Route 53 responds to DNS queries
     * with the applicable value from the secondary resource record set.</li>
     * <li>When the secondary resource record set is unhealthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the primary resource
     * record set.</li>
     * <li>If you omit the <code>HealthCheckId</code> element for the secondary
     * resource record set, and if the primary resource record set is unhealthy,
     * Amazon Route 53 always responds to DNS queries with the applicable value
     * from the secondary resource record set. This is true regardless of the
     * health of the associated endpoint.</li>
     * </ul>
     * <p>
     * You cannot create non-failover resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the
     * <code>EvaluateTargetHealth</code> element and set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see
     * <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>PRIMARY</code> | <code>SECONDARY</code>
     * </p>
     * 
     * @param failover
     *        Failover resource record sets only:</i> To configure failover, you
     *        add the <code>Failover</code> element to two resource record sets.
     *        For one resource record set, you specify <code>PRIMARY</code> as
     *        the value for <code>Failover</code>; for the other resource record
     *        set, you specify <code>SECONDARY</code>. In addition, you include
     *        the <code>HealthCheckId</code> element and specify the health
     *        check that you want Amazon Route 53 to perform for each resource
     *        record set.</p> <note>You can create failover and failover alias
     *        resource record sets only in public hosted zones.</note>
     *        <p>
     *        Except where noted, the following failover behaviors assume that
     *        you have included the <code>HealthCheckId</code> element in both
     *        resource record sets:
     *        </p>
     *        <ul>
     *        <li>When the primary resource record set is healthy, Amazon Route
     *        53 responds to DNS queries with the applicable value from the
     *        primary resource record set regardless of the health of the
     *        secondary resource record set.</li>
     *        <li>When the primary resource record set is unhealthy and the
     *        secondary resource record set is healthy, Amazon Route 53 responds
     *        to DNS queries with the applicable value from the secondary
     *        resource record set.</li>
     *        <li>When the secondary resource record set is unhealthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from
     *        the primary resource record set regardless of the health of the
     *        primary resource record set.</li>
     *        <li>If you omit the <code>HealthCheckId</code> element for the
     *        secondary resource record set, and if the primary resource record
     *        set is unhealthy, Amazon Route 53 always responds to DNS queries
     *        with the applicable value from the secondary resource record set.
     *        This is true regardless of the health of the associated endpoint.</li>
     *        </ul>
     *        <p>
     *        You cannot create non-failover resource record sets that have the
     *        same values for the <code>Name</code> and <code>Type</code>
     *        elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the
     *        <code>EvaluateTargetHealth</code> element and set the value to
     *        true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route
     *        53, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *        >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *        <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>PRIMARY</code> | <code>SECONDARY
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceRecordSetFailover
     */
    public ResourceRecordSet withFailover(String failover) {
        setFailover(failover);
        return this;
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add
     * the <code>Failover</code> element to two resource record sets. For one
     * resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify
     * <code>SECONDARY</code>. In addition, you include the
     * <code>HealthCheckId</code> element and specify the health check that you
     * want Amazon Route 53 to perform for each resource record set.
     * </p>
     * <note>You can create failover and failover alias resource record sets
     * only in public hosted zones.</note>
     * <p>
     * Except where noted, the following failover behaviors assume that you have
     * included the <code>HealthCheckId</code> element in both resource record
     * sets:
     * </p>
     * <ul>
     * <li>When the primary resource record set is healthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the secondary resource
     * record set.</li>
     * <li>When the primary resource record set is unhealthy and the secondary
     * resource record set is healthy, Amazon Route 53 responds to DNS queries
     * with the applicable value from the secondary resource record set.</li>
     * <li>When the secondary resource record set is unhealthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the primary resource
     * record set.</li>
     * <li>If you omit the <code>HealthCheckId</code> element for the secondary
     * resource record set, and if the primary resource record set is unhealthy,
     * Amazon Route 53 always responds to DNS queries with the applicable value
     * from the secondary resource record set. This is true regardless of the
     * health of the associated endpoint.</li>
     * </ul>
     * <p>
     * You cannot create non-failover resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the
     * <code>EvaluateTargetHealth</code> element and set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see
     * <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>PRIMARY</code> | <code>SECONDARY</code>
     * </p>
     * 
     * @param failover
     *        Failover resource record sets only:</i> To configure failover, you
     *        add the <code>Failover</code> element to two resource record sets.
     *        For one resource record set, you specify <code>PRIMARY</code> as
     *        the value for <code>Failover</code>; for the other resource record
     *        set, you specify <code>SECONDARY</code>. In addition, you include
     *        the <code>HealthCheckId</code> element and specify the health
     *        check that you want Amazon Route 53 to perform for each resource
     *        record set.</p> <note>You can create failover and failover alias
     *        resource record sets only in public hosted zones.</note>
     *        <p>
     *        Except where noted, the following failover behaviors assume that
     *        you have included the <code>HealthCheckId</code> element in both
     *        resource record sets:
     *        </p>
     *        <ul>
     *        <li>When the primary resource record set is healthy, Amazon Route
     *        53 responds to DNS queries with the applicable value from the
     *        primary resource record set regardless of the health of the
     *        secondary resource record set.</li>
     *        <li>When the primary resource record set is unhealthy and the
     *        secondary resource record set is healthy, Amazon Route 53 responds
     *        to DNS queries with the applicable value from the secondary
     *        resource record set.</li>
     *        <li>When the secondary resource record set is unhealthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from
     *        the primary resource record set regardless of the health of the
     *        primary resource record set.</li>
     *        <li>If you omit the <code>HealthCheckId</code> element for the
     *        secondary resource record set, and if the primary resource record
     *        set is unhealthy, Amazon Route 53 always responds to DNS queries
     *        with the applicable value from the secondary resource record set.
     *        This is true regardless of the health of the associated endpoint.</li>
     *        </ul>
     *        <p>
     *        You cannot create non-failover resource record sets that have the
     *        same values for the <code>Name</code> and <code>Type</code>
     *        elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the
     *        <code>EvaluateTargetHealth</code> element and set the value to
     *        true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route
     *        53, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *        >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *        <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>PRIMARY</code> | <code>SECONDARY
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceRecordSetFailover
     */
    public void setFailover(ResourceRecordSetFailover failover) {
        this.failover = failover.toString();
    }

    /**
     * <p>
     * <i>Failover resource record sets only:</i> To configure failover, you add
     * the <code>Failover</code> element to two resource record sets. For one
     * resource record set, you specify <code>PRIMARY</code> as the value for
     * <code>Failover</code>; for the other resource record set, you specify
     * <code>SECONDARY</code>. In addition, you include the
     * <code>HealthCheckId</code> element and specify the health check that you
     * want Amazon Route 53 to perform for each resource record set.
     * </p>
     * <note>You can create failover and failover alias resource record sets
     * only in public hosted zones.</note>
     * <p>
     * Except where noted, the following failover behaviors assume that you have
     * included the <code>HealthCheckId</code> element in both resource record
     * sets:
     * </p>
     * <ul>
     * <li>When the primary resource record set is healthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the secondary resource
     * record set.</li>
     * <li>When the primary resource record set is unhealthy and the secondary
     * resource record set is healthy, Amazon Route 53 responds to DNS queries
     * with the applicable value from the secondary resource record set.</li>
     * <li>When the secondary resource record set is unhealthy, Amazon Route 53
     * responds to DNS queries with the applicable value from the primary
     * resource record set regardless of the health of the primary resource
     * record set.</li>
     * <li>If you omit the <code>HealthCheckId</code> element for the secondary
     * resource record set, and if the primary resource record set is unhealthy,
     * Amazon Route 53 always responds to DNS queries with the applicable value
     * from the secondary resource record set. This is true regardless of the
     * health of the associated endpoint.</li>
     * </ul>
     * <p>
     * You cannot create non-failover resource record sets that have the same
     * values for the <code>Name</code> and <code>Type</code> elements as
     * failover resource record sets.
     * </p>
     * <p>
     * For failover alias resource record sets, you must also include the
     * <code>EvaluateTargetHealth</code> element and set the value to true.
     * </p>
     * <p>
     * For more information about configuring failover for Amazon Route 53, see
     * <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>PRIMARY</code> | <code>SECONDARY</code>
     * </p>
     * 
     * @param failover
     *        Failover resource record sets only:</i> To configure failover, you
     *        add the <code>Failover</code> element to two resource record sets.
     *        For one resource record set, you specify <code>PRIMARY</code> as
     *        the value for <code>Failover</code>; for the other resource record
     *        set, you specify <code>SECONDARY</code>. In addition, you include
     *        the <code>HealthCheckId</code> element and specify the health
     *        check that you want Amazon Route 53 to perform for each resource
     *        record set.</p> <note>You can create failover and failover alias
     *        resource record sets only in public hosted zones.</note>
     *        <p>
     *        Except where noted, the following failover behaviors assume that
     *        you have included the <code>HealthCheckId</code> element in both
     *        resource record sets:
     *        </p>
     *        <ul>
     *        <li>When the primary resource record set is healthy, Amazon Route
     *        53 responds to DNS queries with the applicable value from the
     *        primary resource record set regardless of the health of the
     *        secondary resource record set.</li>
     *        <li>When the primary resource record set is unhealthy and the
     *        secondary resource record set is healthy, Amazon Route 53 responds
     *        to DNS queries with the applicable value from the secondary
     *        resource record set.</li>
     *        <li>When the secondary resource record set is unhealthy, Amazon
     *        Route 53 responds to DNS queries with the applicable value from
     *        the primary resource record set regardless of the health of the
     *        primary resource record set.</li>
     *        <li>If you omit the <code>HealthCheckId</code> element for the
     *        secondary resource record set, and if the primary resource record
     *        set is unhealthy, Amazon Route 53 always responds to DNS queries
     *        with the applicable value from the secondary resource record set.
     *        This is true regardless of the health of the associated endpoint.</li>
     *        </ul>
     *        <p>
     *        You cannot create non-failover resource record sets that have the
     *        same values for the <code>Name</code> and <code>Type</code>
     *        elements as failover resource record sets.
     *        </p>
     *        <p>
     *        For failover alias resource record sets, you must also include the
     *        <code>EvaluateTargetHealth</code> element and set the value to
     *        true.
     *        </p>
     *        <p>
     *        For more information about configuring failover for Amazon Route
     *        53, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *        >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *        <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>PRIMARY</code> | <code>SECONDARY
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceRecordSetFailover
     */
    public ResourceRecordSet withFailover(ResourceRecordSetFailover failover) {
        setFailover(failover);
        return this;
    }

    /**
     * <p>
     * The cache time to live for the current resource record set. Note the
     * following:
     * </p>
     * <ul>
     * <li>If you're creating an alias resource record set, omit
     * <code>TTL</code>. Amazon Route 53 uses the value of <code>TTL</code> for
     * the alias target.</li>
     * <li>If you're associating this resource record set with a health check
     * (if you're adding a <code>HealthCheckId</code> element), we recommend
     * that you specify a <code>TTL</code> of 60 seconds or less so clients
     * respond quickly to changes in health status.</li>
     * <li>All of the resource record sets in a group of weighted, latency,
     * geolocation, or failover resource record sets must have the same value
     * for <code>TTL</code>.</li>
     * <li>If a group of weighted resource record sets includes one or more
     * weighted alias resource record sets for which the alias target is an ELB
     * load balancer, we recommend that you specify a <code>TTL</code> of 60
     * seconds for all of the non-alias weighted resource record sets that have
     * the same name and type. Values other than 60 seconds (the TTL for load
     * balancers) will change the effect of the values that you specify for
     * <code>Weight</code>.</li>
     * </ul>
     * 
     * @param tTL
     *        The cache time to live for the current resource record set. Note
     *        the following:</p>
     *        <ul>
     *        <li>If you're creating an alias resource record set, omit
     *        <code>TTL</code>. Amazon Route 53 uses the value of
     *        <code>TTL</code> for the alias target.</li>
     *        <li>If you're associating this resource record set with a health
     *        check (if you're adding a <code>HealthCheckId</code> element), we
     *        recommend that you specify a <code>TTL</code> of 60 seconds or
     *        less so clients respond quickly to changes in health status.</li>
     *        <li>All of the resource record sets in a group of weighted,
     *        latency, geolocation, or failover resource record sets must have
     *        the same value for <code>TTL</code>.</li>
     *        <li>If a group of weighted resource record sets includes one or
     *        more weighted alias resource record sets for which the alias
     *        target is an ELB load balancer, we recommend that you specify a
     *        <code>TTL</code> of 60 seconds for all of the non-alias weighted
     *        resource record sets that have the same name and type. Values
     *        other than 60 seconds (the TTL for load balancers) will change the
     *        effect of the values that you specify for <code>Weight</code>.</li>
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The cache time to live for the current resource record set. Note the
     * following:
     * </p>
     * <ul>
     * <li>If you're creating an alias resource record set, omit
     * <code>TTL</code>. Amazon Route 53 uses the value of <code>TTL</code> for
     * the alias target.</li>
     * <li>If you're associating this resource record set with a health check
     * (if you're adding a <code>HealthCheckId</code> element), we recommend
     * that you specify a <code>TTL</code> of 60 seconds or less so clients
     * respond quickly to changes in health status.</li>
     * <li>All of the resource record sets in a group of weighted, latency,
     * geolocation, or failover resource record sets must have the same value
     * for <code>TTL</code>.</li>
     * <li>If a group of weighted resource record sets includes one or more
     * weighted alias resource record sets for which the alias target is an ELB
     * load balancer, we recommend that you specify a <code>TTL</code> of 60
     * seconds for all of the non-alias weighted resource record sets that have
     * the same name and type. Values other than 60 seconds (the TTL for load
     * balancers) will change the effect of the values that you specify for
     * <code>Weight</code>.</li>
     * </ul>
     * 
     * @return The cache time to live for the current resource record set. Note
     *         the following:</p>
     *         <ul>
     *         <li>If you're creating an alias resource record set, omit
     *         <code>TTL</code>. Amazon Route 53 uses the value of
     *         <code>TTL</code> for the alias target.</li>
     *         <li>If you're associating this resource record set with a health
     *         check (if you're adding a <code>HealthCheckId</code> element), we
     *         recommend that you specify a <code>TTL</code> of 60 seconds or
     *         less so clients respond quickly to changes in health status.</li>
     *         <li>All of the resource record sets in a group of weighted,
     *         latency, geolocation, or failover resource record sets must have
     *         the same value for <code>TTL</code>.</li>
     *         <li>If a group of weighted resource record sets includes one or
     *         more weighted alias resource record sets for which the alias
     *         target is an ELB load balancer, we recommend that you specify a
     *         <code>TTL</code> of 60 seconds for all of the non-alias weighted
     *         resource record sets that have the same name and type. Values
     *         other than 60 seconds (the TTL for load balancers) will change
     *         the effect of the values that you specify for <code>Weight</code>
     *         .</li>
     */
    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * The cache time to live for the current resource record set. Note the
     * following:
     * </p>
     * <ul>
     * <li>If you're creating an alias resource record set, omit
     * <code>TTL</code>. Amazon Route 53 uses the value of <code>TTL</code> for
     * the alias target.</li>
     * <li>If you're associating this resource record set with a health check
     * (if you're adding a <code>HealthCheckId</code> element), we recommend
     * that you specify a <code>TTL</code> of 60 seconds or less so clients
     * respond quickly to changes in health status.</li>
     * <li>All of the resource record sets in a group of weighted, latency,
     * geolocation, or failover resource record sets must have the same value
     * for <code>TTL</code>.</li>
     * <li>If a group of weighted resource record sets includes one or more
     * weighted alias resource record sets for which the alias target is an ELB
     * load balancer, we recommend that you specify a <code>TTL</code> of 60
     * seconds for all of the non-alias weighted resource record sets that have
     * the same name and type. Values other than 60 seconds (the TTL for load
     * balancers) will change the effect of the values that you specify for
     * <code>Weight</code>.</li>
     * </ul>
     * 
     * @param tTL
     *        The cache time to live for the current resource record set. Note
     *        the following:</p>
     *        <ul>
     *        <li>If you're creating an alias resource record set, omit
     *        <code>TTL</code>. Amazon Route 53 uses the value of
     *        <code>TTL</code> for the alias target.</li>
     *        <li>If you're associating this resource record set with a health
     *        check (if you're adding a <code>HealthCheckId</code> element), we
     *        recommend that you specify a <code>TTL</code> of 60 seconds or
     *        less so clients respond quickly to changes in health status.</li>
     *        <li>All of the resource record sets in a group of weighted,
     *        latency, geolocation, or failover resource record sets must have
     *        the same value for <code>TTL</code>.</li>
     *        <li>If a group of weighted resource record sets includes one or
     *        more weighted alias resource record sets for which the alias
     *        target is an ELB load balancer, we recommend that you specify a
     *        <code>TTL</code> of 60 seconds for all of the non-alias weighted
     *        resource record sets that have the same name and type. Values
     *        other than 60 seconds (the TTL for load balancers) will change the
     *        effect of the values that you specify for <code>Weight</code>.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withTTL(Long tTL) {
        setTTL(tTL);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the resource records for the current
     * resource record set.
     * </p>
     * 
     * @return A complex type that contains the resource records for the current
     *         resource record set.
     */
    public java.util.List<ResourceRecord> getResourceRecords() {
        if (resourceRecords == null) {
            resourceRecords = new com.amazonaws.internal.SdkInternalList<ResourceRecord>();
        }
        return resourceRecords;
    }

    /**
     * <p>
     * A complex type that contains the resource records for the current
     * resource record set.
     * </p>
     * 
     * @param resourceRecords
     *        A complex type that contains the resource records for the current
     *        resource record set.
     */
    public void setResourceRecords(
            java.util.Collection<ResourceRecord> resourceRecords) {
        if (resourceRecords == null) {
            this.resourceRecords = null;
            return;
        }

        this.resourceRecords = new com.amazonaws.internal.SdkInternalList<ResourceRecord>(
                resourceRecords);
    }

    /**
     * <p>
     * A complex type that contains the resource records for the current
     * resource record set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceRecords(java.util.Collection)} or
     * {@link #withResourceRecords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceRecords
     *        A complex type that contains the resource records for the current
     *        resource record set.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withResourceRecords(
            ResourceRecord... resourceRecords) {
        if (this.resourceRecords == null) {
            setResourceRecords(new com.amazonaws.internal.SdkInternalList<ResourceRecord>(
                    resourceRecords.length));
        }
        for (ResourceRecord ele : resourceRecords) {
            this.resourceRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains the resource records for the current
     * resource record set.
     * </p>
     * 
     * @param resourceRecords
     *        A complex type that contains the resource records for the current
     *        resource record set.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withResourceRecords(
            java.util.Collection<ResourceRecord> resourceRecords) {
        setResourceRecords(resourceRecords);
        return this;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     * </p>
     * 
     * @param aliasTarget
     *        Alias resource record sets only:
     */
    public void setAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     * </p>
     * 
     * @return Alias resource record sets only:
     */
    public AliasTarget getAliasTarget() {
        return this.aliasTarget;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     * </p>
     * 
     * @param aliasTarget
     *        Alias resource record sets only:
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withAliasTarget(AliasTarget aliasTarget) {
        setAliasTarget(aliasTarget);
        return this;
    }

    /**
     * <p>
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify health
     * check associated with the resource record set.
     * </p>
     * 
     * @param healthCheckId
     *        Health Check resource record sets only, not required for alias
     *        resource record sets:
     */
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify health
     * check associated with the resource record set.
     * </p>
     * 
     * @return Health Check resource record sets only, not required for alias
     *         resource record sets:
     */
    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify health
     * check associated with the resource record set.
     * </p>
     * 
     * @param healthCheckId
     *        Health Check resource record sets only, not required for alias
     *        resource record sets:
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
        return this;
    }

    /**
     * @param trafficPolicyInstanceId
     */
    public void setTrafficPolicyInstanceId(String trafficPolicyInstanceId) {
        this.trafficPolicyInstanceId = trafficPolicyInstanceId;
    }

    /**
     * @return
     */
    public String getTrafficPolicyInstanceId() {
        return this.trafficPolicyInstanceId;
    }

    /**
     * @param trafficPolicyInstanceId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceRecordSet withTrafficPolicyInstanceId(
            String trafficPolicyInstanceId) {
        setTrafficPolicyInstanceId(trafficPolicyInstanceId);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getSetIdentifier() != null)
            sb.append("SetIdentifier: " + getSetIdentifier() + ",");
        if (getWeight() != null)
            sb.append("Weight: " + getWeight() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getGeoLocation() != null)
            sb.append("GeoLocation: " + getGeoLocation() + ",");
        if (getFailover() != null)
            sb.append("Failover: " + getFailover() + ",");
        if (getTTL() != null)
            sb.append("TTL: " + getTTL() + ",");
        if (getResourceRecords() != null)
            sb.append("ResourceRecords: " + getResourceRecords() + ",");
        if (getAliasTarget() != null)
            sb.append("AliasTarget: " + getAliasTarget() + ",");
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId() + ",");
        if (getTrafficPolicyInstanceId() != null)
            sb.append("TrafficPolicyInstanceId: "
                    + getTrafficPolicyInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRecordSet == false)
            return false;
        ResourceRecordSet other = (ResourceRecordSet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSetIdentifier() == null ^ this.getSetIdentifier() == null)
            return false;
        if (other.getSetIdentifier() != null
                && other.getSetIdentifier().equals(this.getSetIdentifier()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null
                && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null
                && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getGeoLocation() == null ^ this.getGeoLocation() == null)
            return false;
        if (other.getGeoLocation() != null
                && other.getGeoLocation().equals(this.getGeoLocation()) == false)
            return false;
        if (other.getFailover() == null ^ this.getFailover() == null)
            return false;
        if (other.getFailover() != null
                && other.getFailover().equals(this.getFailover()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null
                && other.getTTL().equals(this.getTTL()) == false)
            return false;
        if (other.getResourceRecords() == null
                ^ this.getResourceRecords() == null)
            return false;
        if (other.getResourceRecords() != null
                && other.getResourceRecords().equals(this.getResourceRecords()) == false)
            return false;
        if (other.getAliasTarget() == null ^ this.getAliasTarget() == null)
            return false;
        if (other.getAliasTarget() != null
                && other.getAliasTarget().equals(this.getAliasTarget()) == false)
            return false;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null
                && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        if (other.getTrafficPolicyInstanceId() == null
                ^ this.getTrafficPolicyInstanceId() == null)
            return false;
        if (other.getTrafficPolicyInstanceId() != null
                && other.getTrafficPolicyInstanceId().equals(
                        this.getTrafficPolicyInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime
                * hashCode
                + ((getSetIdentifier() == null) ? 0 : getSetIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode
                + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getGeoLocation() == null) ? 0 : getGeoLocation().hashCode());
        hashCode = prime * hashCode
                + ((getFailover() == null) ? 0 : getFailover().hashCode());
        hashCode = prime * hashCode
                + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceRecords() == null) ? 0 : getResourceRecords()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAliasTarget() == null) ? 0 : getAliasTarget().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckId() == null) ? 0 : getHealthCheckId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceId() == null) ? 0
                        : getTrafficPolicyInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public ResourceRecordSet clone() {
        try {
            return (ResourceRecordSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}