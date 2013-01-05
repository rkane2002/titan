package com.thinkaurelius.titan.graphdb.thrift;

import com.thinkaurelius.titan.CassandraStorageSetup;
import com.thinkaurelius.titan.diskstorage.cassandra.embedded.CassandraDaemonWrapper;
import com.thinkaurelius.titan.graphdb.TitanGraphTest;
import org.junit.BeforeClass;

public class InternalCassandraGraphTest extends TitanGraphTest {

    public InternalCassandraGraphTest() {
        super(CassandraStorageSetup.getCassandraThriftGraphConfiguration());
    }

    @BeforeClass
    public static void beforeClass() {
        CassandraDaemonWrapper.start(CassandraStorageSetup.cassandraYamlPath);
    }
}
