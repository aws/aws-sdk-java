
/**
 * Synchronous and asynchronous client classes for accessing AmazonDynamoDBv2.
 *
 * Amazon DynamoDB <b>Overview</b> <p>
 * This is the Amazon DynamoDB API Reference. This guide provides
 * descriptions and samples of the DynamoDB API. For information about
 * application development using this API, see the Amazon DynamoDB
 * Developer Guide.
 * </p>
 * <p>
 * The following are short descriptions of each API action, organized by
 * function.
 * </p>
 * <p>
 * <b>Managing Tables</b>
 * </p>
 * <p>
 * 
 * <ul>
 * <li> <p>
 * <i>CreateTable</i> - Creates a table with user-specified provisioned
 * throughput settings. You must designate one attribute as the hash
 * primary key for the table; you can optionally designate a second
 * attribute as the range primary key. DynamoDB creates indexes on these
 * key attributes for fast data access. Optionally, you can create one or
 * more secondary indexes, which provide fast data access using non-key
 * attributes.
 * </p>
 * </li>
 * <li> <p>
 * <i>DescribeTable</i> - Returns metadata for a table, such as table
 * size, status, and index information.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateTable</i> - Modifies the provisioned throughput settings for
 * a table. Optionally, you can modify the provisioned throughput
 * settings for global secondary indexes on the table.
 * </p>
 * </li>
 * <li> <p>
 * <i>ListTables</i> - Returns a list of all tables associated with the
 * current AWS account and endpoint.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteTable</i> - Deletes a table and all of its indexes.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * <b>Reading Data</b>
 * </p>
 * <p>
 * 
 * <ul>
 * <li> <p>
 * <i>GetItem</i> - Returns a set of attributes for the item that has a
 * given primary key. By default, <i>GetItem</i> performs an eventually
 * consistent read; however, applications can specify a strongly
 * consistent read instead.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchGetItem</i> - Performs multiple <i>GetItem</i> requests for
 * data items using their primary keys, from one table or multiple
 * tables. The response from <i>BatchGetItem</i> has a size limit of 1 MB
 * and returns a maximum of 100 items. Both eventually consistent and
 * strongly consistent reads can be used.
 * </p>
 * </li>
 * <li> <p>
 * <i>Query</i> - Returns one or more items from a table or a secondary
 * index. You must provide a specific hash key value. You can narrow the
 * scope of the query using comparison operators against a range key
 * value, or on the index key. <i>Query</i> supports either eventual or
 * strong consistency. A single response has a size limit of 1 MB.
 * </p>
 * </li>
 * <li> <p>
 * <i>Scan</i> - Reads every item in a table; the result set is
 * eventually consistent. You can limit the number of items returned by
 * filtering the data attributes, using conditional expressions.
 * <i>Scan</i> can be used to enable ad-hoc querying of a table against
 * non-key attributes; however, since this is a full table scan without
 * using an index, <i>Scan</i> should not be used for any application
 * query use case that requires predictable performance.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * <b>Modifying Data</b>
 * </p>
 * <p>
 * 
 * <ul>
 * <li> <p>
 * <i>PutItem</i> - Creates a new item, or replaces an existing item
 * with a new item (including all the attributes). By default, if an item
 * in the table already exists with the same primary key, the new item
 * completely replaces the existing item. You can use conditional
 * operators to replace an item only if its attribute values match
 * certain conditions, or to insert a new item only if that item doesn't
 * already exist.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateItem</i> - Modifies the attributes of an existing item. You
 * can also use conditional operators to perform an update only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteItem</i> - Deletes an item in a table by primary key. You
 * can use conditional operators to perform a delete an item only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchWriteItem</i> - Performs multiple <i>PutItem</i> and
 * <i>DeleteItem</i> requests across multiple tables in a single request.
 * A failure of any request(s) in the batch will not cause the entire
 * <i>BatchWriteItem</i> operation to fail. Supports batches of up to 25
 * items to put or delete, with a maximum total request size of 1 MB.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 */
 package com.amazonaws.services.dynamodbv2;
        