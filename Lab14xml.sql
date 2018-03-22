select xmlquery(' for $i in /bookstores/book[3]
                        return  <result>
                                    {$i/title}
                                    {$i/price}
                                    {for $j in /bookstores/book
                                     where $j/price > $i/price 
                                     order by $j/price/number() descending
                                     return ($j/title, $j/price) }
                                    </result>'
                         passing data
                         returning content)
from bookstores ;
