select l_orderkey as gkey, '00' as const_val from lineitem group by lineitem.l_orderkey order by gkey;