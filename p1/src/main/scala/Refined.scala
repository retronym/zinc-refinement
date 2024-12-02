package demo

class SRC[_]
class Filter
class Refined {

  def select(cols: SRC[_]*) = new {
    def where(filter: Filter => Filter)(implicit d: DummyImplicit) = {
      print("xxxxxxxxxx")
      new {
        def using(opt: Box[SRC[_]] => Some[SRC[_]])(implicit d: DummyImplicit) = opt
      }
    }
  }
}