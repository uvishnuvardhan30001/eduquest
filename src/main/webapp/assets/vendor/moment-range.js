!(function (t, e) {
  "object" == typeof exports && "object" == typeof module
    ? (module.exports = e(require("moment")))
    : "function" == typeof define && define.amd
    ? define("moment-range", ["moment"], e)
    : "object" == typeof exports
    ? (exports["moment-range"] = e(require("moment")))
    : (t["moment-range"] = e(t.moment));
})(this, function (t) {
  return (function (t) {
    function e(r) {
      if (n[r]) return n[r].exports;
      var o = (n[r] = { i: r, l: !1, exports: {} });
      return t[r].call(o.exports, o, o.exports, e), (o.l = !0), o.exports;
    }
    var n = {};
    return (
      (e.m = t),
      (e.c = n),
      (e.i = function (t) {
        return t;
      }),
      (e.d = function (t, n, r) {
        e.o(t, n) ||
          Object.defineProperty(t, n, {
            configurable: !1,
            enumerable: !0,
            get: r,
          });
      }),
      (e.n = function (t) {
        var n =
          t && t.__esModule
            ? function () {
                return t.default;
              }
            : function () {
                return t;
              };
        return e.d(n, "a", n), n;
      }),
      (e.o = function (t, e) {
        return Object.prototype.hasOwnProperty.call(t, e);
      }),
      (e.p = ""),
      e((e.s = 3))
    );
  })([
    function (t, e, n) {
      "use strict";
      var r = n(5)();
      t.exports = function (t) {
        return t !== r && null !== t;
      };
    },
    function (t, e, n) {
      "use strict";
      t.exports = n(18)() ? Symbol : n(20);
    },
    function (e, n) {
      e.exports = t;
    },
    function (t, e, n) {
      "use strict";
      function r(t) {
        return t && t.__esModule ? t : { default: t };
      }
      function o(t, e, n) {
        return (
          e in t
            ? Object.defineProperty(t, e, {
                value: n,
                enumerable: !0,
                configurable: !0,
                writable: !0,
              })
            : (t[e] = n),
          t
        );
      }
      function i(t, e) {
        if (!(t instanceof e))
          throw new TypeError("Cannot call a class as a function");
      }
      function u(t) {
        return (
          (t.range = function (e, n) {
            var r = this;
            return "string" == typeof e && y.hasOwnProperty(e)
              ? new h(t(r).startOf(e), t(r).endOf(e))
              : new h(e, n);
          }),
          (t.rangeFromInterval = function (e) {
            var n =
                arguments.length > 1 && void 0 !== arguments[1]
                  ? arguments[1]
                  : 1,
              r =
                arguments.length > 2 && void 0 !== arguments[2]
                  ? arguments[2]
                  : t();
            if ((t.isMoment(r) || (r = t(r)), !r.isValid()))
              throw new Error("Invalid date.");
            var o = r.clone().add(n, e),
              i = [];
            return i.push(t.min(r, o)), i.push(t.max(r, o)), new h(i);
          }),
          (t.rangeFromISOString = function (e) {
            var n = a(e),
              r = t.parseZone(n[0]),
              o = t.parseZone(n[1]);
            return new h(r, o);
          }),
          (t.parseZoneRange = t.rangeFromISOString),
          (t.fn.range = t.range),
          (t.range.constructor = h),
          (t.isRange = function (t) {
            return t instanceof h;
          }),
          (t.fn.within = function (t) {
            return t.contains(this.toDate());
          }),
          t
        );
      }
      function a(t) {
        return t.split("/");
      }
      Object.defineProperty(e, "__esModule", { value: !0 }),
        (e.DateRange = void 0);
      var s = (function () {
          function t(t, e) {
            var n = [],
              r = !0,
              o = !1,
              i = void 0;
            try {
              for (
                var u, a = t[Symbol.iterator]();
                !(r = (u = a.next()).done) &&
                (n.push(u.value), !e || n.length !== e);
                r = !0
              );
            } catch (t) {
              (o = !0), (i = t);
            } finally {
              try {
                !r && a.return && a.return();
              } finally {
                if (o) throw i;
              }
            }
            return n;
          }
          return function (e, n) {
            if (Array.isArray(e)) return e;
            if (Symbol.iterator in Object(e)) return t(e, n);
            throw new TypeError(
              "Invalid attempt to destructure non-iterable instance"
            );
          };
        })(),
        c =
          "function" == typeof Symbol && "symbol" == typeof Symbol.iterator
            ? function (t) {
                return typeof t;
              }
            : function (t) {
                return t &&
                  "function" == typeof Symbol &&
                  t.constructor === Symbol &&
                  t !== Symbol.prototype
                  ? "symbol"
                  : typeof t;
              },
        f = (function () {
          function t(t, e) {
            for (var n = 0; n < e.length; n++) {
              var r = e[n];
              (r.enumerable = r.enumerable || !1),
                (r.configurable = !0),
                "value" in r && (r.writable = !0),
                Object.defineProperty(t, r.key, r);
            }
          }
          return function (e, n, r) {
            return n && t(e.prototype, n), r && t(e, r), e;
          };
        })();
      e.extendMoment = u;
      var l = n(2),
        v = r(l),
        d = n(1),
        p = r(d),
        y = {
          year: !0,
          quarter: !0,
          month: !0,
          week: !0,
          day: !0,
          hour: !0,
          minute: !0,
          second: !0,
        },
        h = (e.DateRange = (function () {
          function t(e, n) {
            i(this, t);
            var r = e,
              o = n;
            if (1 === arguments.length || void 0 === n)
              if (
                "object" === (void 0 === e ? "undefined" : c(e)) &&
                2 === e.length
              ) {
                var u = s(e, 2);
                (r = u[0]), (o = u[1]);
              } else if ("string" == typeof e) {
                var f = a(e),
                  l = s(f, 2);
                (r = l[0]), (o = l[1]);
              }
            (this.start =
              r || 0 === r ? (0, v.default)(r) : (0, v.default)(-864e13)),
              (this.end =
                o || 0 === o ? (0, v.default)(o) : (0, v.default)(864e13));
          }
          return (
            f(t, [
              {
                key: "adjacent",
                value: function (t) {
                  var e = this.start.isSame(t.end),
                    n = this.end.isSame(t.start);
                  return (
                    (e && t.start.valueOf() <= this.start.valueOf()) ||
                    (n && t.end.valueOf() >= this.end.valueOf())
                  );
                },
              },
              {
                key: "add",
                value: function (t) {
                  var e =
                    arguments.length > 1 && void 0 !== arguments[1]
                      ? arguments[1]
                      : { adjacent: !1 };
                  return this.overlaps(t, e)
                    ? new this.constructor(
                        v.default.min(this.start, t.start),
                        v.default.max(this.end, t.end)
                      )
                    : null;
                },
              },
              {
                key: "by",
                value: function (t) {
                  var e =
                      arguments.length > 1 && void 0 !== arguments[1]
                        ? arguments[1]
                        : { excludeEnd: !1, step: 1 },
                    n = this;
                  return o({}, p.default.iterator, function () {
                    var r = e.step || 1,
                      o = Math.abs(n.start.diff(n.end, t)) / r,
                      i = e.excludeEnd || !1,
                      u = 0;
                    return (
                      e.hasOwnProperty("exclusive") && (i = e.exclusive),
                      {
                        next: function () {
                          var e = n.start.clone().add(u * r, t),
                            a = i ? !(u < o) : !(u <= o);
                          return u++, { done: a, value: a ? void 0 : e };
                        },
                      }
                    );
                  });
                },
              },
              {
                key: "byRange",
                value: function (t) {
                  var e =
                      arguments.length > 1 && void 0 !== arguments[1]
                        ? arguments[1]
                        : { excludeEnd: !1, step: 1 },
                    n = this,
                    r = e.step || 1,
                    i = this.valueOf() / t.valueOf() / r,
                    u = Math.floor(i),
                    a = e.excludeEnd || !1,
                    s = 0;
                  return (
                    e.hasOwnProperty("exclusive") && (a = e.exclusive),
                    o({}, p.default.iterator, function () {
                      return u === 1 / 0
                        ? { done: !0 }
                        : {
                            next: function () {
                              var e = (0, v.default)(
                                  n.start.valueOf() + t.valueOf() * s * r
                                ),
                                o = u === i && a ? !(s < u) : !(s <= u);
                              return s++, { done: o, value: o ? void 0 : e };
                            },
                          };
                    })
                  );
                },
              },
              {
                key: "center",
                value: function () {
                  var t = this.start.valueOf() + this.diff() / 2;
                  return (0, v.default)(t);
                },
              },
              {
                key: "clone",
                value: function () {
                  return new this.constructor(
                    this.start.clone(),
                    this.end.clone()
                  );
                },
              },
              {
                key: "contains",
                value: function (e) {
                  var n =
                      arguments.length > 1 && void 0 !== arguments[1]
                        ? arguments[1]
                        : { excludeStart: !1, excludeEnd: !1 },
                    r = this.start.valueOf(),
                    o = this.end.valueOf(),
                    i = e.valueOf(),
                    u = e.valueOf(),
                    a = n.excludeStart || !1,
                    s = n.excludeEnd || !1;
                  n.hasOwnProperty("exclusive") && (a = s = n.exclusive),
                    e instanceof t &&
                      ((i = e.start.valueOf()), (u = e.end.valueOf()));
                  var c = r < i || (r <= i && !a),
                    f = o > u || (o >= u && !s);
                  return c && f;
                },
              },
              {
                key: "diff",
                value: function (t, e) {
                  return this.end.diff(this.start, t, e);
                },
              },
              {
                key: "duration",
                value: function (t, e) {
                  return this.diff(t, e);
                },
              },
              {
                key: "intersect",
                value: function (t) {
                  var e = this.start.valueOf(),
                    n = this.end.valueOf(),
                    r = t.start.valueOf(),
                    o = t.end.valueOf(),
                    i = e == n,
                    u = r == o;
                  if (i) {
                    var a = e;
                    if (a == r || a == o) return null;
                    if (a > r && a < o) return this.clone();
                  } else if (u) {
                    var s = r;
                    if (s == e || s == n) return null;
                    if (s > e && s < n) return new this.constructor(s, s);
                  }
                  return e <= r && r < n && n < o
                    ? new this.constructor(r, n)
                    : r < e && e < o && o <= n
                    ? new this.constructor(e, o)
                    : r < e && e <= n && n < o
                    ? this.clone()
                    : e <= r && r <= o && o <= n
                    ? new this.constructor(r, o)
                    : null;
                },
              },
              {
                key: "isEqual",
                value: function (t) {
                  return this.start.isSame(t.start) && this.end.isSame(t.end);
                },
              },
              {
                key: "isSame",
                value: function (t) {
                  return this.isEqual(t);
                },
              },
              {
                key: "overlaps",
                value: function (t) {
                  var e =
                      arguments.length > 1 && void 0 !== arguments[1]
                        ? arguments[1]
                        : { adjacent: !1 },
                    n = null !== this.intersect(t);
                  return e.adjacent && !n ? this.adjacent(t) : n;
                },
              },
              {
                key: "reverseBy",
                value: function (t) {
                  var e =
                      arguments.length > 1 && void 0 !== arguments[1]
                        ? arguments[1]
                        : { excludeStart: !1, step: 1 },
                    n = this;
                  return o({}, p.default.iterator, function () {
                    var r = e.step || 1,
                      o = Math.abs(n.start.diff(n.end, t)) / r,
                      i = e.excludeStart || !1,
                      u = 0;
                    return (
                      e.hasOwnProperty("exclusive") && (i = e.exclusive),
                      {
                        next: function () {
                          var e = n.end.clone().subtract(u * r, t),
                            a = i ? !(u < o) : !(u <= o);
                          return u++, { done: a, value: a ? void 0 : e };
                        },
                      }
                    );
                  });
                },
              },
              {
                key: "reverseByRange",
                value: function (t) {
                  var e =
                      arguments.length > 1 && void 0 !== arguments[1]
                        ? arguments[1]
                        : { excludeStart: !1, step: 1 },
                    n = this,
                    r = e.step || 1,
                    i = this.valueOf() / t.valueOf() / r,
                    u = Math.floor(i),
                    a = e.excludeStart || !1,
                    s = 0;
                  return (
                    e.hasOwnProperty("exclusive") && (a = e.exclusive),
                    o({}, p.default.iterator, function () {
                      return u === 1 / 0
                        ? { done: !0 }
                        : {
                            next: function () {
                              var e = (0, v.default)(
                                  n.end.valueOf() - t.valueOf() * s * r
                                ),
                                o = u === i && a ? !(s < u) : !(s <= u);
                              return s++, { done: o, value: o ? void 0 : e };
                            },
                          };
                    })
                  );
                },
              },
              {
                key: "snapTo",
                value: function (t) {
                  var e = this.clone();
                  return (
                    e.start.isSame((0, v.default)(-864e13)) ||
                      (e.start = e.start.startOf(t)),
                    e.end.isSame((0, v.default)(864e13)) ||
                      (e.end = e.end.endOf(t)),
                    e
                  );
                },
              },
              {
                key: "subtract",
                value: function (t) {
                  var e = this.start.valueOf(),
                    n = this.end.valueOf(),
                    r = t.start.valueOf(),
                    o = t.end.valueOf();
                  return null === this.intersect(t)
                    ? [this]
                    : r <= e && e < n && n <= o
                    ? []
                    : r <= e && e < o && o < n
                    ? [new this.constructor(o, n)]
                    : e < r && r < n && n <= o
                    ? [new this.constructor(e, r)]
                    : e < r && r < o && o < n
                    ? [new this.constructor(e, r), new this.constructor(o, n)]
                    : e < r && r < n && o < n
                    ? [new this.constructor(e, r), new this.constructor(r, n)]
                    : [];
                },
              },
              {
                key: "toDate",
                value: function () {
                  return [this.start.toDate(), this.end.toDate()];
                },
              },
              {
                key: "toString",
                value: function () {
                  return this.start.format() + "/" + this.end.format();
                },
              },
              {
                key: "valueOf",
                value: function () {
                  return this.end.valueOf() - this.start.valueOf();
                },
              },
            ]),
            t
          );
        })());
    },
    function (t, e, n) {
      "use strict";
      var r,
        o = n(6),
        i = n(13),
        u = n(9),
        a = n(15);
      (r = t.exports =
        function (t, e) {
          var n, r, u, s, c;
          return (
            arguments.length < 2 || "string" != typeof t
              ? ((s = e), (e = t), (t = null))
              : (s = arguments[2]),
            null == t
              ? ((n = u = !0), (r = !1))
              : ((n = a.call(t, "c")),
                (r = a.call(t, "e")),
                (u = a.call(t, "w"))),
            (c = { value: e, configurable: n, enumerable: r, writable: u }),
            s ? o(i(s), c) : c
          );
        }),
        (r.gs = function (t, e, n) {
          var r, s, c, f;
          return (
            "string" != typeof t
              ? ((c = n), (n = e), (e = t), (t = null))
              : (c = arguments[3]),
            null == e
              ? (e = void 0)
              : u(e)
              ? null == n
                ? (n = void 0)
                : u(n) || ((c = n), (n = void 0))
              : ((c = e), (e = n = void 0)),
            null == t
              ? ((r = !0), (s = !1))
              : ((r = a.call(t, "c")), (s = a.call(t, "e"))),
            (f = { get: e, set: n, configurable: r, enumerable: s }),
            c ? o(i(c), f) : f
          );
        });
    },
    function (t, e, n) {
      "use strict";
      t.exports = function () {};
    },
    function (t, e, n) {
      "use strict";
      t.exports = n(7)() ? Object.assign : n(8);
    },
    function (t, e, n) {
      "use strict";
      t.exports = function () {
        var t,
          e = Object.assign;
        return (
          "function" == typeof e &&
          ((t = { foo: "raz" }),
          e(t, { bar: "dwa" }, { trzy: "trzy" }),
          t.foo + t.bar + t.trzy === "razdwatrzy")
        );
      };
    },
    function (t, e, n) {
      "use strict";
      var r = n(10),
        o = n(14),
        i = Math.max;
      t.exports = function (t, e) {
        var n,
          u,
          a,
          s = i(arguments.length, 2);
        for (
          t = Object(o(t)),
            a = function (r) {
              try {
                t[r] = e[r];
              } catch (t) {
                n || (n = t);
              }
            },
            u = 1;
          u < s;
          ++u
        )
          (e = arguments[u]), r(e).forEach(a);
        if (void 0 !== n) throw n;
        return t;
      };
    },
    function (t, e, n) {
      "use strict";
      t.exports = function (t) {
        return "function" == typeof t;
      };
    },
    function (t, e, n) {
      "use strict";
      t.exports = n(11)() ? Object.keys : n(12);
    },
    function (t, e, n) {
      "use strict";
      t.exports = function () {
        try {
          return Object.keys("primitive"), !0;
        } catch (t) {
          return !1;
        }
      };
    },
    function (t, e, n) {
      "use strict";
      var r = n(0),
        o = Object.keys;
      t.exports = function (t) {
        return o(r(t) ? Object(t) : t);
      };
    },
    function (t, e, n) {
      "use strict";
      var r = n(0),
        o = Array.prototype.forEach,
        i = Object.create,
        u = function (t, e) {
          var n;
          for (n in t) e[n] = t[n];
        };
      t.exports = function (t) {
        var e = i(null);
        return (
          o.call(arguments, function (t) {
            r(t) && u(Object(t), e);
          }),
          e
        );
      };
    },
    function (t, e, n) {
      "use strict";
      var r = n(0);
      t.exports = function (t) {
        if (!r(t)) throw new TypeError("Cannot use null or undefined");
        return t;
      };
    },
    function (t, e, n) {
      "use strict";
      t.exports = n(16)() ? String.prototype.contains : n(17);
    },
    function (t, e, n) {
      "use strict";
      var r = "razdwatrzy";
      t.exports = function () {
        return (
          "function" == typeof r.contains &&
          !0 === r.contains("dwa") &&
          !1 === r.contains("foo")
        );
      };
    },
    function (t, e, n) {
      "use strict";
      var r = String.prototype.indexOf;
      t.exports = function (t) {
        return r.call(this, t, arguments[1]) > -1;
      };
    },
    function (t, e, n) {
      "use strict";
      var r = { object: !0, symbol: !0 };
      t.exports = function () {
        var t;
        if ("function" != typeof Symbol) return !1;
        t = Symbol("test symbol");
        try {
          String(t);
        } catch (t) {
          return !1;
        }
        return (
          !!r[typeof Symbol.iterator] &&
          !!r[typeof Symbol.toPrimitive] &&
          !!r[typeof Symbol.toStringTag]
        );
      };
    },
    function (t, e, n) {
      "use strict";
      t.exports = function (t) {
        return (
          !!t &&
          ("symbol" == typeof t ||
            (!!t.constructor &&
              "Symbol" === t.constructor.name &&
              "Symbol" === t[t.constructor.toStringTag]))
        );
      };
    },
    function (t, e, n) {
      "use strict";
      var r,
        o,
        i,
        u,
        a = n(4),
        s = n(21),
        c = Object.create,
        f = Object.defineProperties,
        l = Object.defineProperty,
        v = Object.prototype,
        d = c(null);
      if ("function" == typeof Symbol) {
        r = Symbol;
        try {
          String(r()), (u = !0);
        } catch (t) {}
      }
      var p = (function () {
        var t = c(null);
        return function (e) {
          for (var n, r, o = 0; t[e + (o || "")]; ) ++o;
          return (
            (e += o || ""),
            (t[e] = !0),
            (n = "@@" + e),
            l(
              v,
              n,
              a.gs(null, function (t) {
                r || ((r = !0), l(this, n, a(t)), (r = !1));
              })
            ),
            n
          );
        };
      })();
      (i = function (t) {
        if (this instanceof i)
          throw new TypeError("Symbol is not a constructor");
        return o(t);
      }),
        (t.exports = o =
          function t(e) {
            var n;
            if (this instanceof t)
              throw new TypeError("Symbol is not a constructor");
            return u
              ? r(e)
              : ((n = c(i.prototype)),
                (e = void 0 === e ? "" : String(e)),
                f(n, { __description__: a("", e), __name__: a("", p(e)) }));
          }),
        f(o, {
          for: a(function (t) {
            return d[t] ? d[t] : (d[t] = o(String(t)));
          }),
          keyFor: a(function (t) {
            var e;
            s(t);
            for (e in d) if (d[e] === t) return e;
          }),
          hasInstance: a("", (r && r.hasInstance) || o("hasInstance")),
          isConcatSpreadable: a(
            "",
            (r && r.isConcatSpreadable) || o("isConcatSpreadable")
          ),
          iterator: a("", (r && r.iterator) || o("iterator")),
          match: a("", (r && r.match) || o("match")),
          replace: a("", (r && r.replace) || o("replace")),
          search: a("", (r && r.search) || o("search")),
          species: a("", (r && r.species) || o("species")),
          split: a("", (r && r.split) || o("split")),
          toPrimitive: a("", (r && r.toPrimitive) || o("toPrimitive")),
          toStringTag: a("", (r && r.toStringTag) || o("toStringTag")),
          unscopables: a("", (r && r.unscopables) || o("unscopables")),
        }),
        f(i.prototype, {
          constructor: a(o),
          toString: a("", function () {
            return this.__name__;
          }),
        }),
        f(o.prototype, {
          toString: a(function () {
            return "Symbol (" + s(this).__description__ + ")";
          }),
          valueOf: a(function () {
            return s(this);
          }),
        }),
        l(
          o.prototype,
          o.toPrimitive,
          a("", function () {
            var t = s(this);
            return "symbol" == typeof t ? t : t.toString();
          })
        ),
        l(o.prototype, o.toStringTag, a("c", "Symbol")),
        l(i.prototype, o.toStringTag, a("c", o.prototype[o.toStringTag])),
        l(i.prototype, o.toPrimitive, a("c", o.prototype[o.toPrimitive]));
    },
    function (t, e, n) {
      "use strict";
      var r = n(19);
      t.exports = function (t) {
        if (!r(t)) throw new TypeError(t + " is not a symbol");
        return t;
      };
    },
  ]);
});
//# sourceMappingURL=moment-range.js.map
